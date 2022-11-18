package com.example.samplerest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {

//     "status": {
//        "timestamp": "2022-11-15T03:53:51.985Z",
//                "error_code": 0,
//                "error_message": null,
//                "elapsed": 0,
//                "credit_count": 0,
//                "notice": null
//    },

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
