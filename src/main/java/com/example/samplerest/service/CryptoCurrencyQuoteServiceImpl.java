package com.example.samplerest.service;

import com.example.samplerest.pojo.cryptocurrency.CryptoCurrency;
import com.example.samplerest.pojo.quote.CryptoCurrencyQuote;
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
public class CryptoCurrencyQuoteServiceImpl {

    @Autowired
    RestTemplate restTemplate;

    public CryptoCurrencyQuote getLatestQuote(String id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("X-CMC_PRO_API_KEY","b54bcf4d-1bca-4e8e-9a24-22ff2c3d462c");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", id);
        String response = restTemplate.exchange("https://sandbox-api.coinmarketcap.com/v2/cryptocurrency/quotes/latest?id={id}", HttpMethod.GET, entity, String.class, uriVariables).getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        CryptoCurrencyQuote cryptoCurrencyQuote = new CryptoCurrencyQuote();
        try {
            cryptoCurrencyQuote = objectMapper.readValue(response, CryptoCurrencyQuote.class);
            System.out.println("cryptoCurrency: " + cryptoCurrencyQuote);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return cryptoCurrencyQuote;
    }
}
