package com.glacier.spring.test;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import javax.xml.ws.WebServiceException;

/**
 * Created by IntelliJ IDEA on 2015-04-21 15:43.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */
public class UnitTestBase {

    private ClassPathXmlApplicationContext context;

    private String springXmlPath;

    public UnitTestBase() {}

    public UnitTestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    @Before     //在具体的单元测试方法执行前执行的内容
    public void before() {
        if (StringUtils.isEmpty(springXmlPath)) {   //加载文件
            springXmlPath = "classpath*:spring-*.xml";
        }
        try {
            context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));   //创建上下文
            //会解析配置文件的信息，并装载其中的信息
            context.start();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

    @After      //在执行之后需要执行的内容
    public void after() {
        context.destroy();
    }

    @SuppressWarnings("unchecked")
    protected <T extends Object> T getBean(String beanId) {
        return (T)context.getBean(beanId);
    }

    protected <T extends Object> T getBean(Class<T> clazz) {
        return context.getBean(clazz);
    }
}
