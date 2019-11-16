package com.java.learn;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Demo1 {

    @BeforeClass
    public void setUp() {
        System.out.println("启动测试的前提条件准备，一般放这个方法中");
    }
    @AfterClass
    public void tearDown() {
        System.out.println("测试运行结束后的步骤，一般是恢复环境到测试开始之前的状态");
    }

    @Test
    public void test2() {
        System.out.println("TestNG");
    }

    @Test
    @Parameters({"Browser","Server"})
    public void test1(String a , String b) {
        System.out.println("这次启动浏览器是"+a+"，打开网页是"+b);

        System.out.println("Hello");
    }


}
