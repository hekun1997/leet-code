package org.example.byteDance;


/**
 * 题目
 * 实现一个 36 进制的加法 0-9 a-z。
 * 示例
 * 输入：["abbbb","1"]，输出："abbbc"
 * 限定语言：C、C++、Java、Python、JavaScript V8、Go
 */
public class day1_code1 {
    public static String Base36Add(String num, String addNum){
        StringBuilder numSb = new StringBuilder(num);
        StringBuilder addNumSb = new StringBuilder(addNum);

        String base = "0123456789abcdefghijklmnopqrstuvwxyz";
        int baseNum = 36;
        int missLen = numSb.length() - addNumSb.length();

        if (missLen > 0) {
            while (missLen > 0) {
                addNumSb.insert(0, "0");
                missLen --;
            }
        }
        if (missLen < 0) {
            while (missLen < 0) {
                numSb.insert(0, "0");
                missLen ++;
            }
        }

        boolean carry = false;
        int currNum = 0;
        int currAddNum = 0;
        int currResultNum = 0;
        int afterAdd = 0;

        StringBuilder result = new StringBuilder();
        int length = numSb.length();
        while (length > 0) {
            result.insert(0, "0");
            length --;
        }
        length = numSb.length();

        for (int i = length - 1; i > -1; i --) {
            currNum = base.indexOf(numSb.charAt(i));
            currAddNum = base.indexOf(addNumSb.charAt(i));
            currResultNum = base.indexOf(result.charAt(i));

            afterAdd = currNum + currAddNum + currResultNum;

            carry = afterAdd >= baseNum;
            if (carry && i > 0) {
                result.setCharAt(i - 1, base.charAt(afterAdd / baseNum));
            }
            result.setCharAt(i, base.charAt(afterAdd % baseNum));
        }
        if (carry) {
            result.insert(0, "1");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(Base36Add("1","zz"));
    }
}
