package com.github.kazy1991.twitterpack.entity;


import com.google.gson.annotations.SerializedName;

import org.threeten.bp.LocalDateTime;

import java.util.List;

public class TweetEntity {

    @SerializedName("created_at")
    LocalDateTime createdAt;

    @SerializedName("id")
    Long id;

    @SerializedName("id_str")
    String idString;

    @SerializedName("text")
    String text;

    @SerializedName("truncated")
    boolean isTruncated;

    @SerializedName("source")
    String source;

    @SerializedName("in_reply_to_status_id")
    Long inReplyToStatusId;

    @SerializedName("in_reply_to_status_id_str")
    String inReplyToStatusIdString;

    @SerializedName("in_reply_to_user_id")
    Long inReplyToUserId;

    @SerializedName("in_reply_to_user_id_str")
    String inReplyToUserIdString;

    @SerializedName("in_reply_to_screen_name")
    String inReplyToScreenName;

    @SerializedName("is_quote_status")
    boolean isQuoteStatus;

    @SerializedName("retweet_count")
    int retweetCount;

    @SerializedName("favorite_count")
    int favoriteCount;

    @SerializedName("lang")
    String lang;

    @SerializedName("user")
    UserEntity userEntity;

    @SerializedName("entities")
    Entities entities;

    public static class Entities {

        @SerializedName("urls")
        List<UrlEntity> urls;

        @SerializedName("user_mentions")
        List<MentionEntity> userMentions;

        @SerializedName("media")
        List<MediaEntity> media;

        @SerializedName("hashtags")
        List<HashtagEntity> hashtags;

    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getIdString() {
        return idString;
    }

    public String getText() {
        return text;
    }

    public boolean isTruncated() {
        return isTruncated;
    }

    public String getSource() {
        return source;
    }

    public Long getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    public String getInReplyToStatusIdString() {
        return inReplyToStatusIdString;
    }

    public Long getInReplyToUserId() {
        return inReplyToUserId;
    }

    public String getInReplyToUserIdString() {
        return inReplyToUserIdString;
    }

    public String getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    public boolean isQuoteStatus() {
        return isQuoteStatus;
    }

    public int getRetweetCount() {
        return retweetCount;
    }

    public int getFavoriteCount() {
        return favoriteCount;
    }

    public String getLang() {
        return lang;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public Entities getEntities() {
        return entities;
    }
}
