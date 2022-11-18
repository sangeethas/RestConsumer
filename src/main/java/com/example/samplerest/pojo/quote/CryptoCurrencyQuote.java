package com.example.samplerest.pojo.quote;

import com.example.samplerest.pojo.Status;
import com.example.samplerest.pojo.cryptocurrency.CryptoCurrencyData;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
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
