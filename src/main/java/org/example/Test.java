package org.example;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        java.util.Queue<String> data = new LinkedList<>();
        data.add("123");
        data.add("456");
        data.add("789");
        System.out.println(data);
        System.out.println(data.poll());
        System.out.println(data);
    }
}
