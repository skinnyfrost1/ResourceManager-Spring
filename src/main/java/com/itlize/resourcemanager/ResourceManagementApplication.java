package com.itlize.resourcemanager;

import com.itlize.resourcemanager.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class ResourceManagementApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ResourceManagementApplication.class, args);
	}

}
