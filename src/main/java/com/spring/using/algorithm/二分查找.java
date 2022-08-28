package com.spring.using.algorithm;

import java.util.Map;

public class 二分查找 {

    public static void main(String[] args) {
        System.out.println((int)Math.floor(1/2));
    }

    public int search(int[] nums, int target) {
        int low = 0;
        int he = nums.length-1;
        while (low<=he){
            int mind = ((low+he)/2);
            if(target==nums[mind]){
                return mind;
            }else if(target>nums[mind]){
                low=mind +1;
            }
            else {
                he = mind-1;
            }
        }
        return -1;
    }
}
