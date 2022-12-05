package com.example.samplerest.pojo.post;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PostData {

    @JsonProperty("post_id")
    private String postId;

    @JsonProperty("owner")
    private PostOwner owner;

    @JsonProperty("text_content")
    private String textContent;

    @JsonProperty("photos")
    private List<String> photos;

    @JsonProperty("comment_count")
    private String commentCount;

    @JsonProperty("like_count")
    private String likeCount;

    @JsonProperty("post_time")
    private String postTime;

    @JsonProperty("language_code")
    private String languageCode;

    @Override
    public String toString() {
        return "PostData{" +
                "postId='" + postId + '\'' +
                ", owner=" + owner +
                ", textContent='" + textContent + '\'' +
                ", photos=" + photos +
                ", commentCount='" + commentCount + '\'' +
                ", likeCount='" + likeCount + '\'' +
                ", postTime='" + postTime + '\'' +
                ", languageCode='" + languageCode + '\'' +
                '}';
    }
}
