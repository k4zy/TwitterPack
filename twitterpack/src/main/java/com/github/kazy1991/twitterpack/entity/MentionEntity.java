package com.github.kazy1991.twitterpack.entity;

import com.google.gson.annotations.SerializedName;

public class MentionEntity {
    @SerializedName("id")
    long id;

    @SerializedName("id_str")
    String idStr;

    @SerializedName("name")
    String name;

    @SerializedName("screen_name")
    String screenName;

    public long getId() {
        return id;
    }

    public String getIdStr() {
        return idStr;
    }

    public String getName() {
        return name;
    }

    public String getScreenName() {
        return screenName;
    }
}
