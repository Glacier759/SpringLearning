package com.glacier.spring.test.test;

/**
 * Created by IntelliJ IDEA on 2015-04-27 19:53.
 * Author:  Glacier (RenLixiang), OurHom.759@gmail.com
 * Company: Class 1204 of Computer Science and Technology
 */
public class FinalTest {
    private static FinalTest finalTest = null;

    public void info() {
        System.out.println("this is a joke! " + this.hashCode());
    }

    public static void main(String[] args) throws Exception {
        new FinalTest();
        System.gc();
        Thread.sleep(1000);
        finalTest.info();
    }

    public void finalize (){
        System.out.println("现在执行了这里 - " + this.hashCode());
        finalTest = this;
    }
}
