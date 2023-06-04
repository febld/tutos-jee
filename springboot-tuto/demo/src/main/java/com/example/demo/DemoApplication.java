package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections.AsLIFOQueue;




@SpringBootApplication
public class DemoApplication {

    private String toto;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
