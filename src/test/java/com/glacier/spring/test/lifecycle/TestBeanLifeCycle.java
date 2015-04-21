package com.glacier.spring.test.lifecycle;

import com.glacier.spring.lifecycle.BeanLifeCycle;
import com.glacier.spring.test.UnitTestBase;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA on 2015-04-21 18:15.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */
public class TestBeanLifeCycle extends UnitTestBase {

    public TestBeanLifeCycle() {
        super("classpath:spring-lifecycle.xml");
    }

    @Test
    public void test1() {
        BeanLifeCycle beanLifeCycle = super.getBean("beanLifeCycle");
    }

}
