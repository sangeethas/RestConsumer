package com.example.samplerest.pojo.cryptocurrency;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class CryptoCurrencyData {

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
