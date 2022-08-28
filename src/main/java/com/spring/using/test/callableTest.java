package com.spring.using.test;

import java.util.concurrent.*;

//线程创建，实现callable接口
public  class callableTest implements Callable<Boolean> {
    //胜利者
    private static String winner;

    @Override
    public Boolean call() {
        for (int i = 0; i <=100; i++) {
            boolean flag = gameOver(i);
            if(flag){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"-->跑了"+i+"步");
        }
        return true;
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

    public static void main(String[] args) throws ExecutionException,InterruptedException {
        test1 one = new test1();
        test1 one1 = new test1();

        //创建服务
        ExecutorService ser = Executors.newFixedThreadPool(2);
        //提交执行
        Future<?> r1 = ser.submit(one);
        Future<?> r2 = ser.submit(one1);

        //获取结果
        Object rs1 =r1.get();
        Object rs2 =r2.get();

    }
}
