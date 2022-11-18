package com.example.samplerest.controller;

import com.example.samplerest.pojo.cryptocurrency.CryptoCurrency;
import com.example.samplerest.pojo.quote.CryptoCurrencyQuote;
import com.example.samplerest.service.CryptoCurrenciesServiceImpl;
import com.example.samplerest.service.CryptoCurrencyQuoteServiceImpl;
import com.example.samplerest.service.PostServiceImpl;
import com.example.samplerest.pojo.post.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MyRestController {

    @Autowired
    PostServiceImpl postServiceImpl;

    @Autowired
    CryptoCurrenciesServiceImpl cryptoCurrenciesServiceImpl;

    @Autowired
    CryptoCurrencyQuoteServiceImpl cryptoCurrencyQuoteServiceImpl;

    @GetMapping("/getPost")
    public Post getPost(@RequestParam("post_id") String postId) {
        return postServiceImpl.getPost(postId);
    }

    @GetMapping("/retrieveAllCryptoCurrencies")
    public CryptoCurrency retrieveAllCryptoCurrencies(@RequestParam("start") String start, @RequestParam("limit") String limit, @RequestParam("sort") String sort) {
        return cryptoCurrenciesServiceImpl.retrieveAllCryptoCurrencies(start, limit, sort);
    }

    @GetMapping("/getLatestQuote")
    public CryptoCurrencyQuote getLatestQuote(@RequestParam("id") String id) {
        return cryptoCurrencyQuoteServiceImpl.getLatestQuote(id);
    }

    @GetMapping("/getJson")
    public String getJson() {
        return postServiceImpl.getJson();
    }


}

