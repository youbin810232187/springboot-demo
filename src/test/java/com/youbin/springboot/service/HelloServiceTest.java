package com.youbin.springboot.service;

import org.junit.*;

import static org.junit.Assert.*;

public class HelloServiceTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("@BeforeClass...");
    }

    @Before
    public void before(){
        System.out.println("@Before...");
    }

    @Test
    public void test2(){
        System.out.println("@Test..test2");
        assertFalse(false);
    }

    @Test
    public void test1(){
        System.out.println("@Test..test1");
        assertFalse(false);
    }

    @After
    public void after(){
        System.out.println("@After...");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("@AfterClass..");
    }

}