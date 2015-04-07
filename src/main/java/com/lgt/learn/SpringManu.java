package com.lgt.learn;

import org.springframework.core.io.ClassPathResource;
/**
 * Created by Administrator on 2015/3/29.
 */
public class SpringManu {
    public static void main(String [] args){
        ClassPathResource res = new ClassPathResource("beans.xml");
        System.out.print('A');
    }
}
