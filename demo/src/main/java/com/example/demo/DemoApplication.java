package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.car.Car;
import com.example.demo.person.Person;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/car.xml");
		// ApplicationContext context2 = new ClassPathXmlApplicationContext("beans/person.xml");
		
		Car car = (Car) context.getBean("car", Car.class);
		// Person boy = context2.getBean("boy", Person.class);
		car.getBrand();
		// boy.runSomething();
	}
}