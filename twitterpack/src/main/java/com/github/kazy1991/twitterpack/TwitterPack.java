package com.github.kazy1991.twitterpack;

import com.github.kazy1991.twitterpack.entity.Oauth2Response;
import com.github.kazy1991.twitterpack.entity.TweetEntity;

import java.util.List;

import io.reactivex.Flowable;

public interface TwitterPack {

    Flowable<List<TweetEntity>> fetchFavorite(String screenName);

    Flowable<Oauth2Response> auth();
}
