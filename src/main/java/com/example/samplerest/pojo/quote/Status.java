package com.example.samplerest.pojo.quote;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {

    @JsonProperty("timestamp")
    private String timestamp;

    @JsonProperty("error_code")
    private int errorCode;

    @JsonProperty("error_message")
    private String errorMessage;

    @JsonProperty("elapsed")
    private int elapsed;

    @JsonProperty("credit_count")
    private int creditCount;

    @JsonProperty("notice")
    private String notice;

    @Override
    public String toString() {
        return "PostStatus{" +
                "timestamp='" + timestamp + '\'' +
                ", errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                ", elapsed=" + elapsed +
                ", creditCount=" + creditCount +
                ", notice='" + notice + '\'' +
                '}';
    }
}
