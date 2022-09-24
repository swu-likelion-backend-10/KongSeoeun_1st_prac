package com.example.PersonalInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableJpaAuditing
@PropertySource("classpath:/env.properties")
public class PersonalInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalInfoApplication.class, args);
	}

}
