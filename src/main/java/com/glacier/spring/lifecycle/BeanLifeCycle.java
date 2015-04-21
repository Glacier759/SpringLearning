package com.glacier.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by IntelliJ IDEA on 2015-04-21 18:14.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */
public class BeanLifeCycle implements InitializingBean, DisposableBean {

    public void defaultInit() {
        System.out.println("Bean Default Init.");
    }

    public void defaultDestroy() {
        System.out.println("Bean Default Destroy.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroy.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean afterPropertiesSet. ");
    }

    public void start() {
        System.out.println("Bean start. ");
    }

    public void stop() {
        System.out.println("Bean stop. ");
    }

}
