package com.spring.aop;

import org.springframework.stereotype.Component;

/**
 * @author CaiShunfeng
 */
@Component
public class Dog implements Animal {

    public void sounds() {
        System.out.println("wang wang wang");
    }
}
