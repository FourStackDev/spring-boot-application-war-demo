package org.manjunath.springboot.applicationwardemo.controller;

import org.manjunath.springboot.applicationwardemo.models.ApplicationDetail;
import org.manjunath.springboot.applicationwardemo.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {
	
	@Autowired
	private ApplicationService service;
	
	@GetMapping("/app-details")
	public ResponseEntity<ApplicationDetail> getAppDetails() {
		return new ResponseEntity<ApplicationDetail>(service.getApplicationDetails(), HttpStatus.OK);
	}
}
