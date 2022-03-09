package org.example;

public class _557 {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words){
            char[] wordArr = word.toCharArray();
            int start = 0;
            int end = wordArr.length - 1;
            char temp;
            while (start < end){
                temp = wordArr[start];
                wordArr[start] = wordArr[end];
                wordArr[end] = temp;

                start ++;
                end --;
            }
            result.append(wordArr).append(' ');
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s).equals("s'teL ekat edoCteeL tsetnoc"));
    }
}
