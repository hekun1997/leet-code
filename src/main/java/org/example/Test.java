package org.example;


import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Chopstick c1 = new Chopstick("c1");
        Chopstick c2 = new Chopstick("c2");
        Chopstick c3 = new Chopstick("c3");
        Chopstick c4 = new Chopstick("c4");
        Chopstick c5 = new Chopstick("c5");

        Philosopher p1 = new Philosopher("p1", c5, c1);
        Philosopher p2 = new Philosopher("p2", c1, c2);
        Philosopher p3 = new Philosopher("p3", c2, c3);
        Philosopher p4 = new Philosopher("p4", c3, c4);
        Philosopher p5 = new Philosopher("p5", c4, c5);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}

class Philosopher extends Thread {
    private Chopstick left;
    private Chopstick right;

    public Philosopher(String name, Chopstick left, Chopstick right) {
        super(name);
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        while (true) {
            if (left.tryLock()) {
                try {
                    if (right.tryLock()) {
                        try {
                            System.out.println(this.getName() + " eating...");
                        } finally {
                            right.unlock();
                        }
                    }
                } finally {
                    left.unlock();
                }
            }
        }
    }
}

class Chopstick extends ReentrantLock {
    private String name;

    public Chopstick(String name) {
        this.name = name;
    }
}

