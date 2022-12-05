package com.example.samplerest.pojo.post;

import com.example.samplerest.pojo.quote.Status;
import com.fasterxml.jackson.annotation.JsonProperty;

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
