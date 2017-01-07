package com.github.kazy1991.twitterpack.entity;

import com.google.gson.annotations.SerializedName;


public class HashtagEntity {

    @SerializedName("text")
    String text;

    public String getText() {
        return text;
    }
}
