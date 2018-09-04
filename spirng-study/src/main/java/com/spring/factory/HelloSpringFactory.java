package com.spring.factory;

import com.spring.entity.HelloSpring;

public class HelloSpringFactory {
    public static HelloSpring getHelloSpringOne() {
        return new HelloSpring();
    }

    public HelloSpring getHelloSpringTwo() {
        return new HelloSpring();
    }
}
