package com.spring.using.Service;

public class Test1 implements TestService{

    @Override
    public String code(){
        return "Test1";
    }
    @Override
    public void test(){
        System.out.println("Test1");
    }
}
