package com.example.samplerest.pojo.quote;

import com.fasterxml.jackson.annotation.JsonProperty;

public class USD {

//    "price": 0.30463471705724987,
//                    "volume_24h": 0.19414620230951574,
//                    "volume_change_24h": 0.3236507394283503,
//                    "percent_change_1h": 0.7392080865499402,
//                    "percent_change_24h": 0.6922367060622072,
//                    "percent_change_7d": 0.32947794735535463,
//                    "percent_change_30d": 0.48718400012628815,
//                    "market_cap": 0.13177955586598933,
//                    "market_cap_dominance": 1898,
//                    "fully_diluted_market_cap": 0.11637449865371452,
//                    "last_updated": "2022-11-17T22:08:05.556Z"

    @JsonProperty("price")
    private String price;

    @JsonProperty("volume_24h")
    private String volume24h;

    @JsonProperty("volume_change_24h")
    private String volumeChange24h;

    @JsonProperty("percent_change_1h")
    private String percentChange1h;

    @JsonProperty("percent_change_24h")
    private String percentChange24h;

    @JsonProperty("percent_change_7d")
    private String percentChange7d;

    @JsonProperty("percent_change_30d")
    private String percentChange30d;

    @JsonProperty("market_cap")
    private String marketCap;

    @JsonProperty("market_cap_dominance")
    private String marketCapDominance;

    @JsonProperty("fully_diluted_market_cap")
    private String fullyDilutedMarketCap;

    @JsonProperty("last_updated")
    private String lastUpdated;

    @Override
    public String toString() {
        return "USD{" +
                "price='" + price + '\'' +
                ", volume24h='" + volume24h + '\'' +
                ", volumeChange24h='" + volumeChange24h + '\'' +
                ", percentChange1h='" + percentChange1h + '\'' +
                ", percentChange24h='" + percentChange24h + '\'' +
                ", percentChange7d='" + percentChange7d + '\'' +
                ", percentChange30d='" + percentChange30d + '\'' +
                ", marketCap='" + marketCap + '\'' +
                ", marketCapDominance='" + marketCapDominance + '\'' +
                ", fullyDilutedMarketCap='" + fullyDilutedMarketCap + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }
}
