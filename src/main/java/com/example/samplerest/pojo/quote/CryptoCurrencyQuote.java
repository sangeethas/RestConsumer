package com.example.samplerest.pojo.quote;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class CryptoCurrencyQuote {
    @JsonProperty("status")
    private Status status;

    @JsonProperty("data")
    private Map<String,Object> data;

    @Override
    public String toString() {
        return "Post{" +
                "status=" + status +
                ", data=" + data +
                '}';
    }

}
