package com.spring.using.algorithm;

public class Solution4 {
    public static void main(String[] args) {

    }
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int A[] = new int[n*2];
        for (int i = 0; i < n; i++) {
            A[i]=nums[i];
            A[i+n] = nums[i];
        }
        return A;
    }
}
