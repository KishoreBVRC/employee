package com.example.demo1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Hellocontroller{
    @GetMapping("/")
    public String hello(){
    return "hello ravi";
    }
}