package com.spring.using.Service;

import com.spring.using.test.test;

import java.util.HashMap;
import java.util.List;

public class Test {

    private final HashMap<String,TestService> testSout = new HashMap<>();
    public Test(List<TestService> testService){
        for(TestService data:testService){
            testSout.put(data.code(),data);
        }
    }


    public  void soutTest(String code){
        //调用方法
        TestService putSout = testSout.get(code);
        putSout.test();
    }

}
