package org.example.ali;

/**
 * Created by hekun on 2023/3/13 10:24
 * 计算十六进制数字（比如：0xeeeeeffffffc01abc）转成二进制数字之后，包含1的数量。
 */
public class _01 {
    public int solution(String num_16) {
        return 0;
    }
    public static void main(String[] args) {
        String num_16 = "a1";
        Integer i = Integer.valueOf(num_16, 16);
        System.out.println(Integer.toBinaryString(i));
    }
}
