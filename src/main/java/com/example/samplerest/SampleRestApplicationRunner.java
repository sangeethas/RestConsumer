package com.example.samplerest;

import com.example.samplerest.service.MyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRestApplicationRunner implements ApplicationRunner {

    @Autowired
    MyServiceImpl serviceImpl;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        String response = serviceImpl.get("317807035");
        System.out.println("############## I'm in with calculated response:" + response);
    }
}
