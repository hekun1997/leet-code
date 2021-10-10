package org.example;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 *
 * 输入: s = ""
 * 输出: 0
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by hekun on 2021/10/9 12:08
 */
public class _3 {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==1){
            return 1;
        }
        String sub;
        int len = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = i + 1; j < s.length() + 1; j++){
                sub = s.substring(i, j);
                if (sub.contains(String.valueOf(s.charAt(j - 1)))){
                    if (len < sub.length()) {
                        len = sub.length();
                    }
                    //break;
                }
            }
        }

        return len;
    }

    public static void main(String[] args) {
        int len = lengthOfLongestSubstring("abcabcbb");
        System.out.println(len);
    }
}
