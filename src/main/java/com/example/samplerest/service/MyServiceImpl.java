package com.example.samplerest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


@Component
public class MyServiceImpl {

    @Autowired
    RestTemplate restTemplate;

    public String get(String postId) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("X-CMC_PRO_API_KEY","b54bcf4d-1bca-4e8e-9a24-22ff2c3d462c");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("post_id", postId);
        String response = restTemplate.exchange("https://sandbox-api.coinmarketcap.com/v1/content/posts/comments?post_id={post_id}", HttpMethod.GET, entity, String.class, uriVariables).getBody();

        return response;
    }

    public String getJson() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange("http://localhost:8081/retrieveJson", HttpMethod.GET, entity, String.class).getBody();
    }
}

