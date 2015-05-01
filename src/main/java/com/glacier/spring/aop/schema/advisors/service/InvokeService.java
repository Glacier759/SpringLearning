package com.glacier.spring.aop.schema.advisors.service;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA on 2015-05-01 14:08.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */

@Service
public class InvokeService {

    public void invoke() {
        System.out.println("InvokeService......");
    }

    public void invokeException()  {
        throw new PessimisticLockingFailureException("");
    }

}
