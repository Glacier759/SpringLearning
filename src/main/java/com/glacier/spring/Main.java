package com.glacier.spring;

import com.glacier.spring.ioc.interfaces.OneInterfaceImpl;

/**
 * Created by IntelliJ IDEA on 2015-04-06 20:58.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */
public class Main {
    public static void main(String[] args) {
        //面向接口编程的说明
        OneInterfaceImpl oif = new OneInterfaceImpl();
        System.out.println(oif.hello("world"));
    }

}
