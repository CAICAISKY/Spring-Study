package com.spring.aop;

public class AnimalImplProxy implements Animal{
    private Animal animal;
    public AnimalImplProxy(Animal animal){
        this.animal = animal;
    }
    public void sounds() {
        System.out.println("before sounds");
        animal.sounds();
        System.out.println("after sounds");
    }
}
