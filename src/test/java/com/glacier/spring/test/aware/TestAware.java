package com.glacier.spring.test.aware;

import com.glacier.spring.test.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA on 2015-04-21 19:38.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware  extends UnitTestBase {

    public TestAware() {
        super("classpath:spring-aware.xml");
    }

//    @Test
//    public void testGlacierApplicationContext() {
//        System.out.println("testGlacierApplicationContext: " + super.getBean("glacierApplicationContext").hashCode());
//    }

    @Test
    public void testGlacierBeanName() {
        System.out.println("testGlacierBeanName: " + super.getBean("glacierBeanName").hashCode());
    }
}
