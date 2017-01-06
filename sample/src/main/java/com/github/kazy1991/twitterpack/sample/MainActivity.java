package com.github.kazy1991.twitterpack.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.kazy1991.twitterpack.TwitterAuthConfig;
import com.github.kazy1991.twitterpack.TwitterPack;
import com.github.kazy1991.twitterpack.TwitterPackImpl;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TwitterAuthConfig authConfig =
                new TwitterAuthConfig(BuildConfig.CONSUMER_KEY, BuildConfig.CONSUMER_SECRET);
        TwitterPack twitterPack = new TwitterPackImpl(this, authConfig);

        findViewById(R.id.text_view).setOnClickListener(it -> {
            Disposable disposable = twitterPack.fetchFavorite("101kaz")
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(response -> {
                        response.toString();

                    }, throwable -> {
                        throwable.toString();
                    });
        });

    }
}
