package com.cyclicbarrier.cyclicbarrier.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cyclicbarrier.cyclicbarrier.service.MainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {

    @Autowired
    private MainService service;

    @GetMapping("service")
    public String getMethodName() {
        service.executeProcess();
        return "Success";
    }
    
}
