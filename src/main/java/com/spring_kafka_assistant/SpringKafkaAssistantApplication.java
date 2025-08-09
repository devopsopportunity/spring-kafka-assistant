package com.spring_kafka_assistant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringKafkaAssistantApplication {
		
	@Bean
	CommandLineRunner runner() {
    	return args -> System.out.println("Hello World from Spring Kafka Assistant!");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaAssistantApplication.class, args);
	}

}
