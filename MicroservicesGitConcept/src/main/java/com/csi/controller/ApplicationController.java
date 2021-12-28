package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping("/")
    public String sayhello()
    {
        return "WELCOME TO CSI PUNE";
    }

    @GetMapping("/services")
    public String CSISERVICE(){
        return "SOFTWARE DEVLOPMENT | QR CODE |";
    }
}

