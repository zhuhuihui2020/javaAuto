package com.course.testng;


import org.testng.annotations.*;

import javax.sound.midi.Soundbank;

public class BasicAnnotation {

    //把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("test这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("test这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforemethod测试方法之前。。。");
    }

    @AfterMethod
    public void afterMehtod(){
        System.out.println("aftermethod测试方法之后。。。");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass类之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass类之前运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }
}
