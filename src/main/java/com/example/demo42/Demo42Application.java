package com.example.demo42;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo42.Mapper")
public class Demo42Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo42Application.class, args);
	}

}
