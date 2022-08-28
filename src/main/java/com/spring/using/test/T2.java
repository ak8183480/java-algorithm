package com.spring.using.test;

import cn.hutool.core.date.DateUtil;

import java.util.HashSet;
import java.util.Set;

public class T2 {

    private static final Set<Character> set = new HashSet<>();

    static {
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int count = 1;
        String str = "aaabiiiboobkkbeeee";
        int[] index = new int[str.length()];
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {//存01进去
            index[i] = set.contains(chars[i]) ? 0 : 1;
        }
        int max = 0;
        int l = 0;
        int y = 0;//账数据个数count
        for (int i : index) {
            y += i;
            l++;//数组下标
            if (y == count && i== 0) {
                max = Math.max(max, l);
            } else if (y > count) {
                l = 0;
                y = 0;
            }
        }
        System.out.println(max);
    }
}
