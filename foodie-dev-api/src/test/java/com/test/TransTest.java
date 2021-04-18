package com.test;

import com.imooc.controller.singleTon;

/**
 * Created by LuoboGan
 * Date:2020/12/9
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Application.class)
public class TransTest {
    public static void main(String[] args) {
        singleTon one = singleTon.getInstance();
        singleTon two = singleTon.getInstance();
        System.out.println(one);
        System.out.println(two);
    }

}
