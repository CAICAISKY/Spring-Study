package com.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.spring.aop..*(..))")
    public void pointCut() {}

    @Around("pointCut()")
    public void doAround(ProceedingJoinPoint pjp) {
        System.out.println("切面-围绕前...");
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("切面-围绕后...");
    }

    @Before("pointCut()")
    public void doBefore() {
        System.out.println("切面-开始...");
    }

    @After("pointCut()")
    public void doAfter() {
        System.out.println("切面-结束...");
    }

    @AfterReturning("pointCut()")
    public void doAfterReturning() {
        System.out.println("切面-结果返回后...");
    }

    @AfterThrowing("pointCut()")
    public void doAfterThrowing() {
        System.out.println("切面-异常抛出后...");
    }
}
