package com.cyclicbarrier.cyclicbarrier.threads;

import java.util.concurrent.CyclicBarrier;

public class Thread3 extends Thread {

    private CyclicBarrier cb;

    public Thread3 (CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run () {
        System.out.println("This is thread 3");
        try {
            cb.await();
        } catch (Exception e) {
            System.out.println("Exception on thread 3");
        }
        System.out.println("Thread 3 continued");
    }
    
}
