package com.example.samplerest.pojo.post;

import com.example.samplerest.pojo.quote.Status;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Post {

    @JsonProperty("status")
    private Status status;

    @JsonProperty("data")
    private List<PostData> data;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<PostData> getData() {
        return data;
    }

    public void setData(List<PostData> data) {
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
