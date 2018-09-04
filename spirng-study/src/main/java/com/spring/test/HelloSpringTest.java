package com.spring.test;

import com.spring.dao.HelloDao;
import com.spring.entity.Hello;
import com.spring.entity.HelloSpring;
import com.spring.service.HelloService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class HelloSpringTest {
    @Test
    public void testHelloSpring() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        helloService.testAutowired();
    }
}
