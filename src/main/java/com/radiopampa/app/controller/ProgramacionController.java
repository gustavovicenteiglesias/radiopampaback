package com.radiopampa.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.radiopampa.app.model.Programacion;
import com.radiopampa.app.service.FilesStorageService;
import com.radiopampa.app.service.ProgramacionServiceApi;

@RestController
@RequestMapping(value = "/api/programacion")
@CrossOrigin("*")
public class ProgramacionController {
	@Autowired
	ProgramacionServiceApi programacionServiceApi;
	@Autowired
	  FilesStorageService storageService;
	@Autowired
	  ServletContext  servletContext;
	@GetMapping(value = "/all")
	public Map<String, Object> listclase() {

	HashMap<String, Object> response = new HashMap<String, Object>();

	try {
		Iterable<Programacion> claseData;
		claseData = programacionServiceApi.findAll();
		response.put("message", "Successful load");
		response.put("data",claseData);
		response.put("success", true);
		return response;

	} catch (Exception e) {
		response.put("message", e.getMessage());
		response.put("success ", false);
		return response;
	}

}
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
	
}
