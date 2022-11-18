package com.example.samplerest.pojo.cryptocurrency;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CryptoCurrencyData {

//    "id": 208,
//            "rank": 6071,
//            "name": "a8vwz9v4ts",
//            "symbol": "nzpgee7m9ib",
//            "slug": "j479udq97ap",
//            "is_active": 2841,
//            "first_historical_data": "2022-11-17T21:49:55.681Z",
//            "last_historical_data": "2022-11-17T21:49:55.681Z",
//            "platform": null

    @JsonProperty("id")
    private String id;

    @JsonProperty("rank")
    private String rank;

    @JsonProperty("name")
    private String name;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("slug")
    private String slug;

    @JsonProperty("is_active")
    private Integer isActive;

    @JsonProperty("first_historical_data")
    private String firstHistoricalData;

    @JsonProperty("last_historical_data")
    private String lastHistoricalData;

    @JsonProperty("platform")
    private String platform;

    @Override
    public String toString() {
        return "CryptoCurrencyData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", slug='" + slug + '\'' +
                ", isActive=" + isActive +
                ", firstHistoricalData='" + firstHistoricalData + '\'' +
                ", lastHistoricalData='" + lastHistoricalData + '\'' +
                ", platform='" + platform + '\'' +
                '}';
    }
}
