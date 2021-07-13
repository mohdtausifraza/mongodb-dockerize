package com.tausif.mongodbdockerize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class MongodbDockerizeApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MongodbDockerizeApplication.class, args);
	}

}
