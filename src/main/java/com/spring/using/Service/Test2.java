package com.spring.using.Service;

public class Test2 implements TestService{
    @Override
    public String code(){
        return "Test2";
    }
    @Override
    public void test(){
        System.out.println("Test2");
    }
}
