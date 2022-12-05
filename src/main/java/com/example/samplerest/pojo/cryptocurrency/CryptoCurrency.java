package com.example.samplerest.pojo.cryptocurrency;

import com.example.samplerest.pojo.quote.Status;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CryptoCurrency {

    @JsonProperty("status")
    private Status status;

    @JsonProperty("data")
    private List<CryptoCurrencyData> data;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<CryptoCurrencyData> getData() {
        return data;
    }

    public void setData(List<CryptoCurrencyData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Post{" +
                "status=" + status +
                ", data=" + data +
                '}';
    }
}
