package com.spring.test;

import com.spring.aop.CglibProxyFactory;
import com.spring.entity.Hello;
import org.junit.Test;

public class CglibTest {

    @Test
    public void testCglib() {
        Hello hello = (Hello) new CglibProxyFactory(new Hello()).getProxyInstance();
        hello.say();
    }
}
