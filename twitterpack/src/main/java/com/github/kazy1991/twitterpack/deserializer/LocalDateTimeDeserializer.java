package com.github.kazy1991.twitterpack.deserializer;


import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import org.threeten.bp.LocalDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import java.lang.reflect.Type;
import java.util.Locale;

public class LocalDateTimeDeserializer implements JsonDeserializer<LocalDateTime> {

    @Override
    public LocalDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        String iSO8601 = json.getAsString();
//        return LocalDateTime.parse(iSO8601, DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss ZZZZZ"));
        return LocalDateTime.parse(iSO8601, DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss ZZZ yyyy", Locale.US));
    }
}
