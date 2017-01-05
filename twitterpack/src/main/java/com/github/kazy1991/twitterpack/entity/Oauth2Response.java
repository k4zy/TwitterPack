package com.github.kazy1991.twitterpack.entity;

import com.google.gson.annotations.SerializedName;

public class Oauth2Response {

    @SerializedName("token_type")
    private String tokenType;

    @SerializedName("access_token")
    private String accessToken;

    public String getTokenType() {
        return tokenType;
    }

    public String getAccessToken() {
        return accessToken;
    }
}
