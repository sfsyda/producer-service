package org.shaziya.producerservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@Slf4j
@SpringBootApplication
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class ProducerServiceApplication {

	public static void main(String[] args) {
		log.info("Starting application...");
		SpringApplication.run(ProducerServiceApplication.class, args);
		log.info("Application started successfully..");
	}

}
