package com.github.kazy1991.twitterpack.storage;


public interface SecureTokenStorage {

    void saveAccessToken(String accessToken);

    String getAccessToken();

    boolean hasAccessToken();
}
