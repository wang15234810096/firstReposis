package com.wang;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**
 * @author Administrator
 */
public class BasicAnno {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例");
    }
    @BeforeTest
    public void test1(){
        System.out.println("这是方法前执行");
    }
    @AfterTest
    public void test12(){
        System.out.println("这是方法前执行");
    }
}
