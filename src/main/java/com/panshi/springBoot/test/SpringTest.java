package com.panshi.springBoot.test;

import com.panshi.springBoot.pojo.Car;
import com.panshi.springBoot.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {

        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
        Car car = ctx.getBean("myCar", Car.class);
        System.out.println(car);
        Person person = ctx.getBean("person", Person.class);
        System.out.println(person);


    }
}
