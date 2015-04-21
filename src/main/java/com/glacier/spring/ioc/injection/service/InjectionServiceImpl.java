package com.glacier.spring.ioc.injection.service;

import com.glacier.spring.ioc.injection.dao.InjectionDAO;

/**
 * Created by IntelliJ IDEA on 2015-04-21 17:20.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */
public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;

    //设值注入
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    //构造器注入
    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String arg) {
        //模拟业务操作
        System.out.println("Service接收参数： " + arg);
        arg = arg + " : " + this.hashCode();
        injectionDAO.save(arg);
    }
}
