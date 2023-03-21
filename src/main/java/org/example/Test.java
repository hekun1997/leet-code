package org.example;


public class Test {

    public static void main(String[] args) throws Exception {
        int a = 0;
        String str = "hello";
        Student student = new Student();
        student.name = "hekun";
        student.age = 0;

        test(a, str, student);
        System.out.println();
    }

    public static void test(int a, String str, Student student) {
        a = 1;
        str = "world";
        student.name = "1997";
        student.age = 1;
    }
}
class Student {
    String name;
    int age;
}