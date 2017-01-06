package com.github.kazy1991.twitterpack;


public class TwitterAuthConfig {

    private final String consumerKey;

    private final String consumerSecret;

    public TwitterAuthConfig(String consumerKey, String consumerSecret) {
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }
}
