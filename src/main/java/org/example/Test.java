package org.example;

public class Test {

    public static void main(String[] args) {
        test(() -> {
            System.out.println();
            return 10;
        });
    }

    public static int test(Inner inner) {
        return inner.show();
    }
}

interface Inner {
    int show();
}
