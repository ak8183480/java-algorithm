package com.spring.using.algorithm;


import java.util.HashMap;
import java.util.Map;
//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//你可以按任意顺序返回答案。
//解题思路：（1.）
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length-1; i++) {
            if(map.containsKey(target-nums[i])){//判断有没有存在的key

            }
            map.put(nums[i],i);//不存在就
        }

    return null;
    }
}
