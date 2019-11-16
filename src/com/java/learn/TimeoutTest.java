package com.java.learn;

import org.testng.annotations.Test;

public class TimeoutTest {
    @Test(timeOut = 3000)
    public void loginTest1() {
        try {
            Thread.sleep(3100);
            System.out.println("TimeoutTest");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test(invocationCount = 5,invocationTimeOut = 5100)
    public void loginTest2() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("loginTest2");
    }
}
