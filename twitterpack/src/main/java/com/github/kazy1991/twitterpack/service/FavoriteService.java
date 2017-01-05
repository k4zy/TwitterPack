package com.github.kazy1991.twitterpack.service;

import com.github.kazy1991.twitterpack.entity.TweetEntity;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FavoriteService {

    @GET("/1.1/favorites/list.json")
    Flowable<List<TweetEntity>> list(@Query("user_id") Long userId,
                                     @Query("screen_name") String screenName,
                                     @Query("count") Integer count,
                                     @Query("since_id") String sinceId,
                                     @Query("max_id") String maxId);

}
