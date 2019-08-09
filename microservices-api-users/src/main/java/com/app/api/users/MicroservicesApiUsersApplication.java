package com.app.api.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesApiUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesApiUsersApplication.class, args);
	}

	// To be able to inject BCryptPasswordEncoder, its object needs to exist in the application context
	// Therefore, we are creating this bean
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
