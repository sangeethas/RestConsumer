package com.example.samplerest;

import com.example.samplerest.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRestApplicationRunner implements ApplicationRunner {

    @Autowired
    PostServiceImpl serviceImpl;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("############## I'm in with calculated response:");
    }
}
