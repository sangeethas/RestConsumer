package com.example.samplerest.service;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.crypto.Data;
import java.util.List;

public class Post {

//    {
//
//        "data": [
//        {
//            "post_id": "hi47wfqw4nr",
//                "owner": {
//            "nickname": "mwjs2wntp8r",
//                    "avatar_url": "nbb2irvxhr"
//        },
//            "text_content": "ck43gumf6g9",
//                "photos": [],
//            "comment_count": "q76wquh6pat",
//                "like_count": "najqs9oybo",
//                "post_time": "ylath2anr18",
//                "language_code": "vvhr9h85xbe"
//        },

    @JsonProperty("status")
    private PostStatus status;

    @JsonProperty("data")
    private List<PostData> data;

}
