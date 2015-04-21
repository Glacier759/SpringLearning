package com.glacier.spring.ioc.injection.dao;

/**
 * Created by IntelliJ IDEA on 2015-04-21 17:21.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */
public class InjectionDAOImpl implements InjectionDAO {
    @Override
    public void save(String arg) {
        //模拟数据库保存操作
        System.out.println("保存数据：" + arg);
    }
}
