package com.java.learn;


import org.testng.annotations.Test;

public class TestNG_Demo2 {
    @Test(enabled = false)
    public void test1() {
        System.out.println("Hello");
    }
    @Test
    public void test2() {
        System.out.println("TestNG");
    }

}
