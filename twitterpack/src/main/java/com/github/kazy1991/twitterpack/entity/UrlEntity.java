package com.github.kazy1991.twitterpack.entity;


import com.google.gson.annotations.SerializedName;

public class UrlEntity {

    @SerializedName("url")
    String url;

    @SerializedName("expanded_url")
    String expandedUrl;

    @SerializedName("display_url")
    String displayUrl;

    public String getUrl() {
        return url;
    }

    public String getExpandedUrl() {
        return expandedUrl;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }
}
