package com.glacier.spring.test.ioc.interfaces;

import com.glacier.spring.ioc.interfaces.OneInterface;
import com.glacier.spring.test.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.Test.*;

/**
 * Created by IntelliJ IDEA on 2015-04-21 15:20.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */

@RunWith(BlockJUnit4ClassRunner.class)

public class TestOneInterface extends UnitTestBase{
    public TestOneInterface() {
        super("classpath*:spring-ioc.xml");     //传入xml的位置
    }

    @Test
    public void testHello() {
        OneInterface oneInterface = super.getBean("oneInterface");
        System.out.println(oneInterface.hello("我的参数"));
    }
}
