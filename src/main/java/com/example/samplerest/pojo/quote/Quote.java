package com.example.samplerest.pojo.quote;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quote {

    @JsonProperty("USD")
    private USD usd;

    @Override
    public String toString() {
        return "Quote{" +
                "usd=" + usd +
                '}';
    }
}
