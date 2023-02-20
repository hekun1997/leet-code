package org.example.forOffer;

import java.util.Objects;

/**
 * Created by hekun on 2023/1/31 09:50
 */
public class _58_1 {
    public static String reverseWords(String s) {
        s = s.trim();
        if (s.length() < 1) return s;
        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = ss.length - 1; i > -1; i--) {
            if (Objects.equals(ss[i], "")) {
                continue;
            }
            sb.append(ss[i]).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }
    public static void main(String[] args) {
        Student s1 = new Student("s1", 18);
        Student s2 = new Student("s1", 18);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}