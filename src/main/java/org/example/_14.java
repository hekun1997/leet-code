package org.example;

import java.util.Arrays;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串""。
 *
 * 
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by hekun on 2021/9/25 16:29
 */
public class _14 {
    public static String longestCommonPrefix(String[] strs) {

        String pre_suffix = "";
        boolean is_continue = true;
        int sub_index = 0;
        int min_len_index = 0;
        boolean minus = false;

        while (is_continue){
            for (int i = 0; i < strs.length; i++){
                if(strs[i].length() <= strs[min_len_index].length()){
                    min_len_index = i;
                }

                if (!strs[i].substring(0, sub_index).equals(pre_suffix)){
                    is_continue = false;
                    minus = true;
                }

                if (pre_suffix.length() == strs[min_len_index].length() || strs[i].isEmpty()){
                    is_continue = false;
                }
            }
            if (is_continue && sub_index < strs[min_len_index].length()){
                sub_index++;
                pre_suffix = strs[min_len_index].substring(0, sub_index);
            }
        }

        if (minus){
            pre_suffix = pre_suffix.substring(0, Math.max(pre_suffix.length() - 1, 0));
        }

        return pre_suffix;
    }

    public static String longestCommonPrefix2(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        Arrays.sort(strs);
        int num = Math.min(strs[0].length(), strs[strs.length-1].length());
        for (int i = 0; i < num; i++) {
            if (strs[0].charAt(i) == strs[strs.length-1].charAt(i)) {
                prefix.append(strs[0].charAt(i));
            } else break;
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix2(strs));
    }
}
