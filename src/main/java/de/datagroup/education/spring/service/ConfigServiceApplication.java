package de.datagroup.education.spring.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.PropertySource;

@EnableConfigServer
@SpringBootApplication
@PropertySource("classpath:/src/main/resources/application.properties")
public class ConfigServiceApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApplication.class, args);
    }

}