package com.spring.using.algorithm;

import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 编写一个函数来查找字符串数组中的最长公共前缀。

 如果不存在公共前缀，返回空字符串 ""。

  

 示例 1：

 输入：strs = ["flower","flow","flight"]
 输出："fl"
 */
public class 最长公共前缀 {
    public static void main(String[] args) {
        String strs[] = {"dog","racecar","car"};
        Solution A = new Solution();
        String data = A.longestCommonPrefix(strs);
        System.out.println(data);
    }
    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            String re = "";
            if(strs==null||strs.length==0){
                return re;
            }
            List<char[]> str = new ArrayList<>();
            int min = strs[0].length();
            for (int i = 0; i < strs.length; i++) {
                char c[]=strs[i].toCharArray();
                str.add(c);
                if(strs[i].length()<min){
                    min=strs[i].length();
                }
            }
            A:for (int i = 0; i < min; i++) {
                char it = str.get(0)[i];
                B:for (int i1 = 1; i1 < str.size(); i1++) {
                    if(!Objects.equals(it,str.get(i1)[i])){
                        break A;
                    }
                }
                re = re+it;
            }
            return re;
        }
    }
}
