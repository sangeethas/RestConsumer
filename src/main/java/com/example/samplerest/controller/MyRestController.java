package com.example.samplerest.controller;

import com.example.samplerest.service.MyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;
import java.util.Map;

@RestController
public class MyRestController {

    @Autowired
    MyServiceImpl serviceImpl;

    @GetMapping("/get")
    public String get(@RequestParam("post_id") String postId) {
        return serviceImpl.get(postId);
    }

    @GetMapping("/getJson")
    public String getJson() {
        return serviceImpl.getJson();
    }


}

