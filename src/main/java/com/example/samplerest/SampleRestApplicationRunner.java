package com.example.samplerest;

import com.example.samplerest.cache.CacheImpl;
import com.example.samplerest.pojo.cryptocurrency.CryptoCurrency;
import com.example.samplerest.pojo.cryptocurrency.CryptoCurrencyData;
import com.example.samplerest.service.CryptoCurrenciesServiceImpl;
import com.example.samplerest.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class SampleRestApplicationRunner implements ApplicationRunner {

    @Autowired
    CryptoCurrenciesServiceImpl cryptoCurrenciesServiceImpl;

    @Autowired
    CacheImpl cacheImpl;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("############## I'm in with calculated response:");
        CryptoCurrency cryptoCurrency = cryptoCurrenciesServiceImpl.retrieveAllCryptoCurrencies("1", "100", "id");
        List<CryptoCurrencyData> data = cryptoCurrency.getData();
        for (CryptoCurrencyData cryptoCurrencyData : data) {
            cacheImpl.setCache(cryptoCurrencyData);
        }
    }
}
