package com.glacier.spring.aop.schema.advice.biz;

/**
 * Created by IntelliJ IDEA on 2015-04-29 20:40.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */
public class AspectBiz {

    public void biz() {
        System.out.println("AspectBiz biz. ");
        //throw new RuntimeException();
    }

    public void init(String bizName, int times) {
        System.out.println("AspectBiz init:" + bizName + " " + times);
    }

}
