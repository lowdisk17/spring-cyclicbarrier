package com.cyclicbarrier.cyclicbarrier.threads;

import java.util.concurrent.CyclicBarrier;

public class Thread2 extends Thread {

    private CyclicBarrier cb;

    public Thread2 (CyclicBarrier cb) {
        this.cb = cb;
    }


    @Override
    public void run () {
        System.out.println("This is thread 2");
        try {
            cb.await();
        } catch (Exception e) {
            System.out.println("Exception on thread 2");
        }
        System.out.println("Thread 2 continued");
    }
    
}
