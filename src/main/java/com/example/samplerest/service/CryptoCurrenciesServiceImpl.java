package com.example.samplerest.service;

import com.example.samplerest.pojo.cryptocurrency.CryptoCurrency;
import com.example.samplerest.pojo.post.Post;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
public class CryptoCurrenciesServiceImpl {

    @Autowired
    RestTemplate restTemplate;

    public CryptoCurrency retrieveAllCryptoCurrencies(String start, String limit, String sort) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("X-CMC_PRO_API_KEY","b54bcf4d-1bca-4e8e-9a24-22ff2c3d462c");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("start", start);
        uriVariables.put("limit", limit);
        uriVariables.put("sort", sort);
        String response = restTemplate.exchange("https://sandbox-api.coinmarketcap.com/v1/cryptocurrency/map?start={start}&limit={limit}&sort={sort}", HttpMethod.GET, entity, String.class, uriVariables).getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        CryptoCurrency cryptoCurrency = new CryptoCurrency();
        try {
            cryptoCurrency = objectMapper.readValue(response, CryptoCurrency.class);
            System.out.println("cryptoCurrency: " + cryptoCurrency);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return cryptoCurrency;
    }
}
