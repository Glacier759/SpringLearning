package com.glacier.spring.ioc.interfaces;

/**
 * Created by IntelliJ IDEA on 2015-04-06 22:10.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */
public class OneInterfaceImpl implements OneInterface {
    @Override
    //面向接口编程的例子
    public String hello(String word) {
        return "Word from interface\"OneInterface\":" + word;
    }
}
