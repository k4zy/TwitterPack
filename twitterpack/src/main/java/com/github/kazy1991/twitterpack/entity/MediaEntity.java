package com.github.kazy1991.twitterpack.entity;

import com.google.gson.annotations.SerializedName;

public class MediaEntity {

    @SerializedName("id")
    long id;

    @SerializedName("id_str")
    String idStr;

    @SerializedName("media_url")
    String mediaUrl;

    @SerializedName("media_url_https")
    String mediaUrlHttps;

    @SerializedName("url")
    String url;

    @SerializedName("display_url")
    String displayUrl;

    @SerializedName("expanded_url")
    String expandedUrl;

    @SerializedName("type")
    String type;

    public long getId() {
        return id;
    }

    public String getIdStr() {
        return idStr;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public String getMediaUrlHttps() {
        return mediaUrlHttps;
    }

    public String getUrl() {
        return url;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public String getExpandedUrl() {
        return expandedUrl;
    }

    public String getType() {
        return type;
    }
}

