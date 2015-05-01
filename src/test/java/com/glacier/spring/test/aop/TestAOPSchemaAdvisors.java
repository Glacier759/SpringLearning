package com.glacier.spring.test.aop;

import com.glacier.spring.aop.schema.advisors.service.InvokeService;
import com.glacier.spring.test.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA on 2015-05-01 14:21.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchemaAdvisors extends UnitTestBase {

    public TestAOPSchemaAdvisors() {
        super("classpath:spring-aop-schema-advisors.xml");
    }

    @Test
    public void testSave() {
        InvokeService service = super.getBean("invokeService");
        service.invoke();

        System.out.println();
        service.invokeException();
    }

}
