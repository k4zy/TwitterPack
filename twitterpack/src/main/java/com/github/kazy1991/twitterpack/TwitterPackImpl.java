package com.github.kazy1991.twitterpack;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import com.github.kazy1991.twitterpack.deserializer.LocalDateTimeDeserializer;
import com.github.kazy1991.twitterpack.entity.Oauth2Response;
import com.github.kazy1991.twitterpack.entity.TweetEntity;
import com.github.kazy1991.twitterpack.interceptor.Oauth2Interceptor;
import com.github.kazy1991.twitterpack.service.FavoriteService;
import com.github.kazy1991.twitterpack.service.Oauth2Service;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import org.reactivestreams.Publisher;
import org.threeten.bp.LocalDateTime;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import okhttp3.OkHttpClient;
import okio.ByteString;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TwitterPackImpl implements TwitterPack {

    private FavoriteService favoriteService;

    private Oauth2Service oauth2Service;

    private SharedPreferences sharedPreferences; // todo: security issue

    public TwitterPackImpl(Context context) {
        this.sharedPreferences = context.getSharedPreferences("TwitterPack", Context.MODE_PRIVATE);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new Oauth2Interceptor(sharedPreferences))
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.twitter.com")
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(customGson()))
                .build();
        this.oauth2Service = retrofit.create(Oauth2Service.class);
        this.favoriteService = retrofit.create(FavoriteService.class);
    }

    private Gson customGson() {
        return new GsonBuilder()
                .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeDeserializer())
                .create();
    }

    public Flowable<List<TweetEntity>> fetchFavorite(final String screenName) {
        if (sharedPreferences.getString("ACCESS_TOKEN", null) == null) {
            return auth().flatMap(new Function<Oauth2Response, Publisher<List<TweetEntity>>>() {
                @Override
                public Publisher<List<TweetEntity>> apply(Oauth2Response oauth2Response) throws Exception {
                    return favoriteService.list(null, screenName, 200, null, null);
                }
            });
        } else {
            return favoriteService.list(null, screenName, 200, null, null);
        }
    }

    public Flowable<Oauth2Response> auth() {
        return oauth2Service.auth("Basic " + basicToken(), "client_credentials").doOnNext(new Consumer<Oauth2Response>() {
            @SuppressLint("CommitPrefEdits")
            @Override
            public void accept(Oauth2Response oauth2Response) throws Exception {
                sharedPreferences.edit().putString("ACCESS_TOKEN", oauth2Response.getAccessToken()).commit();
            }
        });
    }

    private String basicToken() {
        return ByteString.of(baseString().getBytes()).base64();
    }

    private String baseString() {
        return BuildConfig.CONSUMER_KEY + ":" + BuildConfig.CONSUMER_SECRET;
    }

}
