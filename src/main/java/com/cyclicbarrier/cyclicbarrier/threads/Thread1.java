package com.cyclicbarrier.cyclicbarrier.threads;

import java.util.concurrent.CyclicBarrier;

public class Thread1 extends Thread {

    private CyclicBarrier cb;

    public Thread1 (CyclicBarrier cb) {
        this.cb = cb;
    }


    @Override
    public void run () {
        System.out.println("This is thread 1");
        try {
            cb.await();
        } catch (Exception e) {
            System.out.println("Exception on thread 1");
        }
        System.out.println("Thread 1 continued");
    }
    
}
