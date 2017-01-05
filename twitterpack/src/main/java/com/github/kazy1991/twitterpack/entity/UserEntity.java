package com.github.kazy1991.twitterpack.entity;


import com.google.gson.annotations.SerializedName;

import org.threeten.bp.LocalDateTime;

public class UserEntity {

    @SerializedName("id")
    long id;

    @SerializedName("id_str")
    String idString;

    @SerializedName("name")
    String name;

    @SerializedName("screen_name")
    String screenName;

    @SerializedName("location")
    String location;

    @SerializedName("description")
    String description;

    @SerializedName("url")
    String url;

    @SerializedName("protected")
    boolean isProtected;

    @SerializedName("followers_count")
    int followersCount;

    @SerializedName("friends_count")
    int friendsCount;

    @SerializedName("listed_count")
    int listedCount;

    @SerializedName("created_at")
    LocalDateTime createdAt;

    @SerializedName("favourites_count")
    int favouritesCount;

    @SerializedName("utc_offset")
    int utcOffset;

    @SerializedName("time_zone")
    String timeZone;

    @SerializedName("geo_enabled")
    boolean isGeoEnabled;

    @SerializedName("verified")
    boolean isVerified;

    @SerializedName("statuses_count")
    int statusesCount;

    @SerializedName("lang")
    String lang;

    @SerializedName("contributors_enabled")
    boolean isContributorsEnabled;

    @SerializedName("is_translator")
    boolean isTranslator;

    @SerializedName("is_translation_enabled")
    boolean isTranslationEnabled;

    @SerializedName("profile_image_url")
    String profileImageUrl;

    @SerializedName("profile_image_url_https")
    String profileImageUrlHttps;

    @SerializedName("profile_background_color")
    String profileBackgroundColor;

    @SerializedName("profile_background_image_url")
    String profileBackgroundImageUrl;

    @SerializedName("profile_background_image_url_https")
    String profileBackgroundImageUrlHttps;

    @SerializedName("profile_banner_url")
    String profileBannerUrl;

    @SerializedName("profile_link_color")
    String profileLinkColor;

    @SerializedName("profile_sidebar_border_color")
    String profileSidebarBorderColor;

    @SerializedName("profile_sidebar_fill_color")
    String profileSidebarFillColor;

    @SerializedName("profile_text_color")
    String profileTextColor;

    @SerializedName("profile_use_background_image")
    boolean isProfileUseBackgroundImage;

    @SerializedName("has_extended_profile")
    boolean hasExtendedProfile;

    @SerializedName("default_profile")
    boolean isDefaultProfile;

    @SerializedName("default_profile_image")
    boolean isDefaultProfileImage;

    public long getId() {
        return id;
    }

    public String getIdString() {
        return idString;
    }

    public String getName() {
        return name;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public boolean isProtected() {
        return isProtected;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public int getFriendsCount() {
        return friendsCount;
    }

    public int getListedCount() {
        return listedCount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public int getFavouritesCount() {
        return favouritesCount;
    }

    public int getUtcOffset() {
        return utcOffset;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public boolean isGeoEnabled() {
        return isGeoEnabled;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public int getStatusesCount() {
        return statusesCount;
    }

    public String getLang() {
        return lang;
    }

    public boolean isContributorsEnabled() {
        return isContributorsEnabled;
    }

    public boolean isTranslator() {
        return isTranslator;
    }

    public boolean isTranslationEnabled() {
        return isTranslationEnabled;
    }

    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    public String getProfileBannerUrl() {
        return profileBannerUrl;
    }

    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    public String getProfileTextColor() {
        return profileTextColor;
    }

    public boolean isProfileUseBackgroundImage() {
        return isProfileUseBackgroundImage;
    }

    public boolean isHasExtendedProfile() {
        return hasExtendedProfile;
    }

    public boolean isDefaultProfile() {
        return isDefaultProfile;
    }

    public boolean isDefaultProfileImage() {
        return isDefaultProfileImage;
    }
}
