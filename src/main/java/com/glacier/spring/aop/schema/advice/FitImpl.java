package com.glacier.spring.aop.schema.advice;

/**
 * Created by IntelliJ IDEA on 2015-04-30 15:51.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */
public class FitImpl implements Fit {
    @Override
    public void filter() {
        System.out.println("FitImpl filter.");
    }
}
