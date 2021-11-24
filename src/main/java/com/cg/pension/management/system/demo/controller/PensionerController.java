package com.cg.pension.management.system.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pension.management.system.demo.entities.Pensioner;
import com.cg.pension.management.system.demo.service.PensionerService;

@RestController
public class PensionerController {

	private static final Logger LOG = LoggerFactory.getLogger(PensionerService.class);
	
	@Autowired
	private PensionerService pensionerService;
	
	@PostMapping("/addpensioner")
	public ResponseEntity<Pensioner> addPensioner(@RequestBody Pensioner pensioner) {
		
			LOG.info("add");
			Pensioner pen= pensionerService.addPensioner(pensioner); // line 
			HttpHeaders headers = new HttpHeaders();
			headers.add("message", "This pensioner is not available in the database but added successfully.");
			LOG.info(headers.toString());
			ResponseEntity<Pensioner> response = new ResponseEntity<Pensioner>(pen, headers, HttpStatus.CREATED);
			return response;
		
	}
	
	@PostMapping("/updatepensioner")
	public ResponseEntity<Pensioner> updatePensioner(@RequestBody Pensioner pensioner) {
		
			LOG.info("update");
			Pensioner pen= pensionerService.updatePensioner(pensioner); // line 
			HttpHeaders headers = new HttpHeaders();
			headers.add("message", "This pensioner is not available in the database but added successfully.");
			LOG.info(headers.toString());
			ResponseEntity<Pensioner> response = new ResponseEntity<Pensioner>(pen, headers, HttpStatus.OK);
			return response;
		
	}
}
