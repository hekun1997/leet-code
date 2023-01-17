package org.example.forOffer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by hekun on 2023/1/15 09:22
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 *
 * 示例 1:
 *
 * 输入：s = "abaccdeff"
 * 输出：'b'
 * 示例 2:
 *
 * 输入：s = ""
 * 输出：' '
 * 
 *
 * 限制：
 *
 * 0 <= s 的长度 <= 50000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _50 {
    public static char firstUniqChar(String s) {
        Map<Character, Integer> uniqChars = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            uniqChars.put(s.charAt(i), uniqChars.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Character key: uniqChars.keySet()) {
            if (uniqChars.get(key) == 1) {
                return key;
            }
        }
        return ' ';
    }
    public static void main(String[] args) {
        String s = "";
        System.out.println(firstUniqChar(s));
    }
}
