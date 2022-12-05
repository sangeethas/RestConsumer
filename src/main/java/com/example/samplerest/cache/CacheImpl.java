package com.example.samplerest.cache;

import com.example.samplerest.pojo.cryptocurrency.CryptoCurrencyData;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CacheImpl {

    private Map<String, CryptoCurrencyData> map;

    public void setCache(CryptoCurrencyData cryptoCurrencyData) {
//        map.put(cryptoCurrencyData.getId(), cryptoCurrencyData);
    }

    public CryptoCurrencyData getCache(String id) {
        return map.get(id);
    }
}
