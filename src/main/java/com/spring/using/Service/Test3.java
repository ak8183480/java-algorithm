package com.spring.using.Service;

public class Test3 implements TestService{
    @Override
    public String code(){
        return "Test3";
    }
    @Override
    public void test(){
        System.out.println("Test3");
    }
}
