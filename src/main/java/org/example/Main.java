package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        Calculator calculator = context.getBean(Calculator.class);

        System.out.println(calculator.sum(1,2));
        System.out.println(calculator.subtract(8,2));
        System.out.println(calculator.divide(6,2));
        System.out.println(calculator.multiply(3,2));
    }
}
