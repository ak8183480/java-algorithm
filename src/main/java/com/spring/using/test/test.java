package com.spring.using.test;

import cn.hutool.core.date.DateTime;

import java.util.Date;
import java.util.Objects;

public class test {
    public static void main(String[] args) {
//        QueryDataByRequisitionIdVO a = new QueryDataByRequisitionIdVO();
//        QueryDataByRequisitionIdVO.item b = a.new item();
//        String stra = "a";
//        String strb = "a";
//        System.out.println(stra.equals(strb));
//        test te = new test();
//        te.testEquals("a");
String p = "-36";
Integer pp= Integer.parseInt(p);
        System.out.println(pp);
        Date a = new DateTime("20220824145523");
        System.out.println(a);
        String tt = "1123636";
        tt.equals("6652");
    }
    public Boolean testEquals(Object s){
        if (this == s) {
            return true;
        }else {
            return false;
        }
    }
}
