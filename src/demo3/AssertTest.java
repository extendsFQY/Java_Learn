package demo3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {

    @Test
    public void test1() {

        //Assert.assertEquals(11,11,"not equal");
        Assert.assertEquals("ab","a","not equal");
    }

    @Test
    public void test2() {

        String str3 = null;
        Assert.assertNotNull(str3,"对象为空");

        String[] str1 = {"Anthony", "Tom", "John"};
        String[] str2 = {"John", "Anthony", "Tom"};
        Assert.assertEqualsNoOrder(str1,str2,"不相同");
        Assert.assertFalse(1==1,"1==1相同");


    }

    @Test
    public void test3() {
        String[] st1 = {"Anthony", "Tom", "John"};
        String[] st2 = {"John", "Anthony", "Tom"};
        String[] st3 = st1;
        Assert.assertSame(st1, st3, "not same");
        System.out.println("111111111111111111111");
        Assert.assertSame(st1, st2, "not same");
        System.out.println("222222222222222222222");
    }




}
