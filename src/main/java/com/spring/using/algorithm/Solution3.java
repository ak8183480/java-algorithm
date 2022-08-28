package com.spring.using.algorithm;


import java.util.*;

/**
 有元音字母 aeiou AEIOU
 现规定 已元音字母开头及结尾的字符串称为 元音字符串
 元音字符串里不是元音字符的个数称为瑕疵度
 比如   abi  瑕疵度是 1
 现要求 对指定的字符串,指定的瑕疵度,找出满足瑕疵度的最长元音字符串,如果不存在满足瑕疵度的元音字符串，返回0

 例:
 0
 abcuuiseou
 输出 3 满足瑕疵度0的元音字符串包括  uui  或者 eou

 例:
 1
 aeibociu
 输出 5 最长元音字符串是 aeibo
 **/
public class Solution3 {

    //测试
    public static void main(String[] args) {
        String input = "aaabbbkkbeeee";
        Solution3 test = new Solution3();
        test.logestVowel(3,input);
    }
    public int logestVowel(int a,String s){
        String[] mapArr = s.split("");//分开字符
        Map<Integer, Integer> map = new HashMap<>();//记录元音字符和非元音的位置
        List<Integer> noAEIOU = new ArrayList<>();//非元音位置List
        String BestLongString = "";//输出的字符串
        int longNumber =0;
        for (int i = 0; i < mapArr.length; i++) {//数据分类处理----map记录元音和非元音位置---noAEIOU非元音位置List
            int flag = yesOrno(mapArr[i].charAt(0));
            map.put(i,flag);//存进map中
            if(flag==0){
                noAEIOU.add(i);//非元音字符对应的下标
            }
        }
        int getNumber = noAEIOU.size()-a; //可以取的次数
        for (int i = 0; i <=getNumber; i++) {//循环取a个数做处理--循环中表示可以取几次规定的数
            List<Integer> number = new ArrayList<>();//存放非数字的下标
            for (int i1 =i; i1<i+a; i1++) {//需要取的个数
                number.add(i1);
            }
            //判断number前后数字是否连号
            if(map.containsKey(noAEIOU.get(number.get(0))-1)&&map.get(noAEIOU.get(number.get(0))-1)==1){//判断前面的非元音数字是否连号
                if(map.containsKey(noAEIOU.get(number.get(number.size()-1))+1) && map.get(noAEIOU.get(number.get(number.size()-1))+1)==1){//判断后面的非元音字符是否连号
                    //不连号就取最长字符串
                    //取前一个和后一个非元的下标
                    if(number.get(0)==0&&number.get(number.size()-1)==(noAEIOU.size()-1)){//前面后面都没了
                        String st = "";
                        int x =0;
                        int y= map.size()-1;
                        for (int i1 = x; i1 <= y; i1++) {
                            st=st+mapArr[i1];
                            longNumber=i1+1;
                        }
                        BestLongString =st;
                    }else if(number.get(0)==0){//前面没了
                        String st = "";
                        int x =0;
                        int y= noAEIOU.get(number.get(number.size()-1)+1)-1;
                        for (int i1 = x; i1 <= y; i1++) {
                            st=st+mapArr[i1];
                            longNumber=i1+1;
                        }
                        BestLongString =st;

                    } else if(number.get(number.size()-1)==(noAEIOU.size()-1)){//后面没了
                        String st = "";
                        int x =noAEIOU.get(number.get(0)-1)+1;
                        int y= map.size()-1;
                        for (int i1 = x; i1 <= y; i1++) {
                            st=st+mapArr[i1];
                            longNumber=i1+1;
                        }
                        BestLongString =st;
                    }else {//都有
                        String st = "";
                        int x =noAEIOU.get(number.get(0)-1)+1;
                        int y= noAEIOU.get(number.get(number.size()-1)+1)-1;
                        for (int i1 = x; i1 <= y; i1++) {
                            st=st+mapArr[i1];
                            longNumber=i1+1;
                        }
                        BestLongString =st;
                    }

                }
            }
        }
        System.out.println("BestLongString:-->"+BestLongString);
        System.out.println("longNumber---->"+longNumber);
        return longNumber;//存在返回字符串不存在返回0
    }
    //判断是否为元音字母
    public int yesOrno(char a){
        switch (a){
            case 'a':
                return 1;
            case 'e':
                return 1;
            case 'i':
                return 1;
            case 'o':
                return 1;
            case 'u':
                return 1;
            default:
                return 0;
        }
    }
}
//存进map里key为数组下表value为是否为元音字母1是0否
//非元音字符下标的数组
//取对应个数的非元音数组中的存的字符的顺序号-（连续的个数）
//做判断取得数的前后都不相邻非元音进入下一步
//取最长字符串
//存到Re中--后面如果要是有更长的字符串则替换该字符串
//存进map里key为数组下表value为是否为元音字母1是0否
//非元音字符下标的数组
//取对应个数的非元音数组中的存的字符的顺序号-（连续的个数）
//做判断取得数的前后都不相邻非元音进入下一步
//取最长字符串
//存到Re中--后面如果要是有更长的字符串则替换该字符串
//
//    private static final Set<Character> set = new HashSet<>();
//
//static {
//        set.add('a');
//        set.add('e');
//        set.add('i');
//        set.add('o');
//        set.add('u');
//        set.add('A');
//        set.add('E');
//        set.add('I');
//        set.add('O');
//        set.add('U');
//        }
//
//public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int count = scanner.nextInt();
//        String str = scanner.next();
//        int[] index = new int[str.length()];
//        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//        index[i] = set.contains(chars[i]) ? 0 : 1;
//        }
//        int max = 0;
//        int l = 0;
//        int y = 0;
//        for (int i : index) {
//        y += i;
//        l++;
//        if (y == count) {
//        max = Math.max(max, l);
//        } else if (y > count) {
//        l = 0;
//        y = 0;
//        }
//        }
//        System.out.println(max);
//        }