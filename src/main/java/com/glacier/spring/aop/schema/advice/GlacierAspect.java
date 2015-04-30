package com.glacier.spring.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by IntelliJ IDEA on 2015-04-29 20:40.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */
public class GlacierAspect {

    public void before() {
        System.out.println("GlacierAspect before.");
    }

    public void afterReturning() {
        System.out.println("GlacierAspect after returning..");
    }

    public void afterThrowing() {
        System.out.println("GlacierAspect after throwing..");
    }

    public void after() {
        System.out.println("GlacierAspect after.");
    }

    public Object around( ProceedingJoinPoint point) {
        Object obj = null;
        try {
            System.out.println("GlacierAspect around 1");
            obj = point.proceed();
            System.out.println("GlacierAspect around 2");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return obj;
    }


    public Object aroundInit( ProceedingJoinPoint point, String bizName, int times) {
        System.out.println("aroundInit " + bizName + " " + times);
        Object obj = null;
        try {
            System.out.println("GlacierAspect aroundInit 1");
            obj = point.proceed();
            System.out.println("GlacierAspect aroundInit 2");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return obj;
    }

}
