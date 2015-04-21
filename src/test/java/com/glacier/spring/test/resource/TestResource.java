package com.glacier.spring.test.resource;

import com.glacier.spring.resource.GlacierResource;
import com.glacier.spring.test.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA on 2015-04-21 21:50.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestResource extends UnitTestBase{

    public TestResource() {
        super("classpath:spring-resource.xml");
    }

    @Test
    public void testResource() {
        GlacierResource resource = super.getBean("glacierResource");
        try {
            resource.resource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
