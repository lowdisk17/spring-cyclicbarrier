package com.cyclicbarrier.cyclicbarrier.service;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.stereotype.Service;

import com.cyclicbarrier.cyclicbarrier.threads.Thread1;
import com.cyclicbarrier.cyclicbarrier.threads.Thread2;
import com.cyclicbarrier.cyclicbarrier.threads.Thread3;

@Service
public class MainService {

    private CyclicBarrier cb = new CyclicBarrier(3);
    private ExecutorService es = Executors.newFixedThreadPool(10);

    public void executeProcess () {

        es.submit(new Thread1(cb));
        es.submit(new Thread2(cb));
        es.submit(new Thread3(cb));
    }
    
}
