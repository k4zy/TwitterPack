package com.github.kazy1991.twitterpack.storage;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.github.gfx.util.encrypt.EncryptedSharedPreferences;
import com.github.gfx.util.encrypt.Encryption;

public class SecureTokenStorageImpl implements SecureTokenStorage {

    public static final String ACCESS_TOKEN_KEY = "ACCESS_TOKEN_KEY";

    private static final String PREF_NAME = "TwitterPack";

    private SharedPreferences sharedPreferences;

    public SecureTokenStorageImpl(Context context) {
        SharedPreferences basePreference = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        this.sharedPreferences = new EncryptedSharedPreferences(Encryption.getDefaultCipher(), basePreference, context);
    }

    @SuppressLint("CommitPrefEdits")
    @Override
    public void saveAccessToken(@NonNull String accessToken) {
        sharedPreferences.edit().putString(ACCESS_TOKEN_KEY, accessToken).commit();
    }

    @Nullable
    @Override
    public String getAccessToken() {
        return sharedPreferences.getString(ACCESS_TOKEN_KEY, null);
    }

    @Override
    public boolean hasAccessToken() {
        return sharedPreferences.getString(ACCESS_TOKEN_KEY, null) != null;
    }
}
