package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        DataSource oracleBean = applicationContext.getBean("orcaleBean",DataSource.class);
//        DataSource oracleBean1 = applicationContext.getBean("orcale1",DataSource.class);
//        DataSource oracleBean2 = applicationContext.getBean("orcale2",DataSource.class);
        DataSource mysqlBean = applicationContext.getBean("mysqlBean",DataSource.class);

        System.out.println(oracleBean);
//        System.out.println(oracleBean1);
//        System.out.println(oracleBean2);
        System.out.println(mysqlBean);

        Restaurant restaurant = applicationContext.getBean("restaurant",Restaurant.class);
        restaurant.displayDrink();
    }
}
