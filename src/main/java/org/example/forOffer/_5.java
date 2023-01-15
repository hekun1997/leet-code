package org.example.forOffer;

/**
 * Created by hekun on 2023/1/13 09:18
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 * 
 *
 * 示例 1：
 *
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/ti-huan-kong-ge-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _5 {
    public static String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }
    public static String replaceSpace2(String s) {
        if (s == null) {
            return s;
        }
        StringBuffer result = new StringBuffer();
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                result.append(s.charAt(i));
                j ++;
            } else {
                result.append("%20");
                j += 3;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(replaceSpace2("").equals(""));
        System.out.println(replaceSpace2(" ").equals("%20"));
        System.out.println(replaceSpace2(null));
    }
}
