package com.example.samplerest.service;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostOwner {

    @JsonProperty("nickname")
    private String nickName;

    @JsonProperty("avatar_url")
    private String avatarUrl;
}
