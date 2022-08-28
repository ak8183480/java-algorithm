package com.spring.using.test;

public class test1 implements Runnable{

    //胜利者
    private static String winner;

    @Override
    public void run() {
        for (int i = 0; i <=100; i++) {
            boolean flag = gameOver(i);
            if(flag){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"-->跑了"+i+"步");
        }
    }
    //判断比赛结束
    private boolean gameOver(int step){
        if(winner!=null){
            return true;
        }else {
            if(step==100){
                winner = Thread.currentThread().getName();
                System.out.println("winner:"+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        test1 one = new test1();
        new Thread(one,"狗狗").start();
        new Thread(one,"兔子").start();
    }
}
