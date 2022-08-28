package com.spring.using.designmode;

/**
 * @author 砒霜
 */
public class 懒汉模式 {
    public static void main(String[] args) {

    }
}
 class LazySingleton{
    private static LazySingleton instance;
    private LazySingleton(){
    }
    public  static LazySingleton getInstance(){
        if(instance==null){
            synchronized(LazySingleton.class){
                //双重加锁
                if(instance==null){
                    instance  = new LazySingleton();
                }

            }
        }
        return instance;
    }
}
