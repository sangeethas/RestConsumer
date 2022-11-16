package com.example.samplerest.service;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PostData {

//    "post_id": "hi47wfqw4nr",
//            "owner": {
//        "nickname": "mwjs2wntp8r",
//                "avatar_url": "nbb2irvxhr"
//    },
//            "text_content": "ck43gumf6g9",
//            "photos": [],
//            "comment_count": "q76wquh6pat",
//            "like_count": "najqs9oybo",
//            "post_time": "ylath2anr18",
//            "language_code": "vvhr9h85xbe"

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


}
