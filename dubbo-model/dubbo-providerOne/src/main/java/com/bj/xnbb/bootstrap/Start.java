package com.bj.xnbb.bootstrap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) throws Exception{

        new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
        System.in.read();
    }
}
