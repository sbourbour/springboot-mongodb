package com.shahriar.mongodbspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongodbSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbSpringbootApplication.class, args);
	}
}
