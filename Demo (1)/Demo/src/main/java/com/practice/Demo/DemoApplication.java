package com.practice.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("/propertiesFolder/application.properties")
public class DemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =  SpringApplication.run(DemoApplication.class, args);
		
		Student student = context.getBean(Student.class);
		
		System.out.println(student.getName());
	}

}
