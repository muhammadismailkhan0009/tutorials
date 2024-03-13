package com.apitrove.springboot_scheduler_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

import com.apitrove.springboot_scheduler_demo.configs.ApplicationHints;

@SpringBootApplication
@ImportRuntimeHints(ApplicationHints.class)
public class SpringbootGraalvmBasicDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGraalvmBasicDemoApplication.class, args);

	}

}
