package com.spring.test;

import com.spring.aop.Animal;
import com.spring.aop.Dog;
import com.spring.aop.ProxyFactory;
import org.junit.Test;

public class InterfaceProxyTest {
    @Test
    public void testInterFaceProxy() {
        Animal animal = (Animal) new ProxyFactory(new Dog()).getProxyInstance();
        animal.sounds();
    }
}
