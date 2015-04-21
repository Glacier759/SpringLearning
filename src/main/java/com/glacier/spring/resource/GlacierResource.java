package com.glacier.spring.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA on 2015-04-21 21:49.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */
public class GlacierResource implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void resource() throws IOException {
//        Resource resource = applicationContext.getResource("classpath:config.txt");
        Resource resource = applicationContext.getResource("file:/home/glacier/Java/Spring/SpringLearning/src/main/resources/config.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
