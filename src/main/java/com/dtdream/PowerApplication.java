package com.dtdream;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = {"com.dtdream.report.dao","com.dtdream.comment.dao","com.dtdream.line.dao","com.dtdream.model.dao"})
@ComponentScan(basePackages = "com.dtdream")
@SpringBootApplication(exclude = MybatisAutoConfiguration.class)
public class PowerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerApplication.class, args);
	}
}
