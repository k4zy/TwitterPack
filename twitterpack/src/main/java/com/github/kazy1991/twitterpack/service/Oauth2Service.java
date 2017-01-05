package com.github.kazy1991.twitterpack.service;

import com.github.kazy1991.twitterpack.entity.Oauth2Response;

import io.reactivex.Flowable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface Oauth2Service {

    @Headers("Content-Type: application/x-www-form-urlencoded;charset=UTF-8")
    @FormUrlEncoded
    @POST("/oauth2/token")
    Flowable<Oauth2Response> auth(@Header("Authorization") String auth,
                                  @Field("grant_type") String grantType);
}
