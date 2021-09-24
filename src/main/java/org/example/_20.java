package org.example;

import java.util.List;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 
 *
 * 示例 1：
 *
 * 输入：s = "()"
 * 输出：true
 * 示例2：
 *
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例3：
 *
 * 输入：s = "(]"
 * 输出：false
 * 示例4：
 *
 * 输入：s = "([)]"
 * 输出：false
 * 示例5：
 *
 * 输入：s = "{[]}"
 * 输出：true
 * 
 *
 * 提示：
 *
 * 1 <= s.length <= 104
 * s 仅由括号 '()[]{}' 组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * Created by hekun on 2021/9/24 20:33
 */
public class _20 {
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1){
            return false;
        }
        Stack<Character> left = new Stack<>();
        //Stack<Character> right = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch (c){
                case '(':
                case '[':
                case '{':
                    left.push(c);
                    break;
                case ')':
                case ']':
                case '}':
                    if (!checkRight(left, c)){
                        return false;
                    }
                    break;
                default:
            }
        }

        return left.size() == 0;
    }

    public static boolean checkRight(Stack<Character> left, char right){
        if (left.size() < 1){
            return false;
        }
        char c = left.pop();
        if(c == '(' && right == ')'){
            return true;
        }else if (c == '[' && right == ']'){
            return true;
        }else return c == '{' && right == '}';
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
