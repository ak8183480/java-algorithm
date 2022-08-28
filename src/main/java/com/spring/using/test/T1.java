package com.spring.using.test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;

public class T1 {
    private static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    /**
     * main入口由OJ平台调用
     */
    public static void main(String[] args) {
        String input = "aaabbbkkbeeee";
        System.out.println(getLongestFlawedVowelSubstrLen(3,input));

    }
    // 待实现函数，在此函数中填入答题代码
    private static int getLongestFlawedVowelSubstrLen(int flaw, String input) {
        int left = 0;
        int right = -1;
        int currentFlaw = 0;
        int max = 0;

        while (right < input.length() - 1) {
            right += 1;
            if (!isVowel(input.charAt(right))) {
                currentFlaw += 1;
            }

            while (currentFlaw > flaw) {
                if (!isVowel(input.charAt(left))) {
                    currentFlaw -= 1;
                }
                // 这步会提前到达下一个点，可能会超范围
                left += 1;
            }

            if (left < input.length() && currentFlaw == flaw && isVowel(input.charAt(left)) && isVowel(
                    input.charAt(right))) {
                max = Math.max(max, right + 1 - left);
            }
        }

        return max;
    }

    private static boolean isVowel(char c) {
        return vowels.contains(c);
    }
}
