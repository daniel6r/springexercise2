package com.example.springexercise2;

import com.example.springexercise2.service.RegistrationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringExerciseApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringExerciseApplication.class, args);

		RegistrationService registrationService = (RegistrationService) context.getBean("registrationService");

		System.out.println("default countries: " + registrationService.getCountryList());
		System.out.println("default minimum age: " + registrationService.getMinimumAge());
		System.out.println("default subscription status: " + registrationService.isNewsletterSubscription());
	}

}
