package com.github.kazy1991.twitterpack.interceptor;

import com.github.kazy1991.twitterpack.storage.SecureTokenStorage;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class Oauth2Interceptor implements Interceptor {

    final private SecureTokenStorage secureTokenStorage;

    public Oauth2Interceptor(SecureTokenStorage secureTokenStorage) {
        this.secureTokenStorage = secureTokenStorage;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        String path = originalRequest.url().uri().getPath();
        switch (path) {
            case ("/1.1/favorites/list.json"):
                return bearerAuthProceed(chain);
            default:
                return chain.proceed(originalRequest);
        }
    }

    private Response bearerAuthProceed(Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        String accessToken = secureTokenStorage.getAccessToken();
        if (accessToken != null) {
            builder.addHeader("Authorization", "Bearer " + accessToken);
        }
        return chain.proceed(builder.build());
    }
}
