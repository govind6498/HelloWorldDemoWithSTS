package com.example.helloworlddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello BridgeLabz");
		SpringApplication.run(HelloWorldDemoApplication.class, args);
	}

}
