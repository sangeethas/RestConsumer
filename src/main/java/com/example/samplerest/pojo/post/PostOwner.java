package com.example.samplerest.pojo.post;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostOwner {

    @JsonProperty("nickname")
    private String nickName;

    @JsonProperty("avatar_url")
    private String avatarUrl;

    @Override
    public String toString() {
        return "PostOwner{" +
                "nickName='" + nickName + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                '}';
    }
}
