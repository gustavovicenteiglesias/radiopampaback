package com.radiopampa.app.controller;

import java.util.HashMap;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.radiopampa.app.model.Programacion;

import com.radiopampa.app.service.ProgramacionServiceApi;


@RestController
@RequestMapping(value = "/api/programacion")
@CrossOrigin("*")
public class ProgramacionController {
	@Autowired
	ProgramacionServiceApi programacionServiceApi;
	
	
	
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
	
}
