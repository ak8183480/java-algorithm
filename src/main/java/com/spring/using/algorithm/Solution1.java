package com.spring.using.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
//你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。

//1207. 独一无二的出现次数(解题思路：1.统计每个数字出现的次数2.去除重复的的数字次数3.对比前后数字的size的长度)
public class Solution1 {
    //方法
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);//getOrDefault-map中有这个key时，就使用这个key对应的value值，如果没有就使用默认值defaultValue
        }
        System.out.println(map.values());
        System.out.println(map.size());
        return map.size() == new HashSet<>(map.values()).size();
    }
    //测试
    public static void main(String[] args) {
        int arr[] ={1,1,6,0,0};
        Solution1 test = new Solution1();
        System.out.println(test.uniqueOccurrences(arr));
    }
}
