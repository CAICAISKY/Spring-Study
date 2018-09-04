package com.spring.test;

import com.spring.aop.AnimalImplProxy;
import com.spring.aop.Dog;
import org.junit.Test;

public class StaticProxyTest {
    @Test
    public void testStaticProxy() {
        Dog dog = new Dog();
        AnimalImplProxy animalProxy = new AnimalImplProxy(dog);
        animalProxy.sounds();
    }
}
