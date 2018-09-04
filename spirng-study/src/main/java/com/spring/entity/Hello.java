package com.spring.entity;

import org.springframework.stereotype.Component;

@Component(value = "helloName")
public class Hello {
    public void say() {
        System.out.println("say hello");
    }
}
