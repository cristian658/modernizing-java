package com.massacre.cloudnative.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfiguration
public class CoolstoreCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoolstoreCatalogServiceApplication.class, args);
	}

}
