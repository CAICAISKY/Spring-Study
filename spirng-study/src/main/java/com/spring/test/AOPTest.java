package com.spring.test;

import com.spring.aop.Animal;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    @Test
    public void testAOP() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*Animal animal = (Animal) applicationContext.getBean("dog");
        animal.sounds();*/
    }
}
