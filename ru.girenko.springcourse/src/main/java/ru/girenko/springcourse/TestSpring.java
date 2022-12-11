package ru.girenko.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);


        context.close();
    }
}
