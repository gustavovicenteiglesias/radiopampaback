package com.radiopampa.app.controller;

import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.radiopampa.app.service.FilesStorageService;
import com.radiopampa.app.service.ResponseMessage;

@Controller
@RequestMapping(value = "/api/programacion")
@CrossOrigin("*")
public class ImagenController {
	
	@Autowired
	  FilesStorageService storageService;
	@Autowired
	  ServletContext  servletContext;
	 @GetMapping(
			  value = "/imagen/{filename:.+}",
			  produces = MediaType.IMAGE_JPEG_VALUE
			)
	  	
	  	@ResponseBody
	  		public ResponseEntity<Resource> getImageAsResource(@PathVariable String filename) {
	      	HttpHeaders headers = new HttpHeaders();
	      	CacheControl headerValue = CacheControl.maxAge(31536000, TimeUnit.SECONDS);
	      	headers.setCacheControl(headerValue);
	      	Resource file = storageService.load(filename);
	      	return new ResponseEntity<>(file, headers, HttpStatus.OK);
	  }
	 
	 @GetMapping("/carpeta/{id}")
	  	public ResponseEntity<ResponseMessage> data(@PathVariable("id") String id){
		  storageService.carpeta(id);
		  return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage("ok"));
	  }
	

}
