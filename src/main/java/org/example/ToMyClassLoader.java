package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by hekun on 2023/2/4 10:44
 */


public class ToMyClassLoader {
    static List<ReentrantLock> locks = new ArrayList<>();
    public static void main(String[] args) {
        locks.add(new ReentrantLock());
        locks.add(new ReentrantLock());
        locks.add(new ReentrantLock());
        locks.add(new ReentrantLock());
        locks.add(new ReentrantLock());
    }
    class P extends Thread {
        int n;
        @Override
        public void run() {
            while (locks.get(n).isLocked() || locks.get( (n + 1) % 5 ).isLocked()) {

            }
        }
    }
}

