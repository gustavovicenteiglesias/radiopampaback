package com.radiopampa.app;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.radiopampa.app.service.FilesStorageService;

@SpringBootApplication
public class AppRadioPampaApplication {
	@Resource
	 FilesStorageService storageService;
	public static void main(String[] args) {
		SpringApplication.run(AppRadioPampaApplication.class, args);
	}

}
