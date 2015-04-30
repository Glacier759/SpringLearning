package com.glacier.spring.test.aop;

import com.glacier.spring.aop.schema.advice.biz.AspectBiz;
import com.glacier.spring.test.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA on 2015-04-29 22:18.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchemaAdivce extends UnitTestBase {

    public TestAOPSchemaAdivce() {
        super("classpath:spring-aop-schema-advice.xml");
    }

    @Test
    public void testBiz() {
        AspectBiz biz = super.getBean("aspectBiz");
        biz.biz();
    }

    @Test
    public void testInit() {
        AspectBiz biz = super.getBean("aspectBiz");
        biz.init("glacierService", 3);
    }

}
