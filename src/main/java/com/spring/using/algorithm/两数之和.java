package com.spring.using.algorithm;


import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 *
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *
 */
public class 两数之和 {


    class Solution {

//        public int[] twoSum(int[] nums, int target) {
//            int[] re = new int[2];
//            Map<Integer,Integer> map = new HashMap<>();
//            for (int i = 0; i < nums.length; i++) {
//                map.put(nums[i],i);
//            }
//            for (int i = 0; i < nums.length; i++) {
//                re[0] = i;
//                if((!(map.get(target-nums[i])==null))&&i!=map.get(target-nums[i])){
//                    re[1] = map.get(target-nums[i]);
//                    return re;
//                }
//            }
//            return null;
//        }
        //优化
        public int[] twoSum(int[] nums, int target) {
            int[] re = new int[2];
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                re[0] = i;
                if((!(map.get(target-nums[i])==null))&&i!=map.get(target-nums[i])){
                    re[1] = map.get(target-nums[i]);
                    return re;
                }else {
                    map.put(nums[i],i);
                }
            }
            return null;
        }

    }
}
