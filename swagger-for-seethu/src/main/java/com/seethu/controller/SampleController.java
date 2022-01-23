package com.seethu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.glic.api.ga.claims.domain.ClaimSubmitResponse;
import com.seethu.model.SeethaObject;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/seetha/api")
@CrossOrigin
public class SampleController {
	
	List<SeethaObject> seethaList = new ArrayList<>();

	@RequestMapping(method = RequestMethod.GET, value = "/seethu")
	public String sayHello() {
		return "Seethas's Swagger Application";
	}
	
	@GetMapping("/")
	public String seethaDevi() {
		return "My best friend..Seethu.. Your Swagger Application working fine";
	}
	
	@ApiOperation(value = "Adding Seetha Data", nickname = "Sample Seetha Api", response = SeethaObject.class, notes = "This is used to add the seetha's data")
	@PostMapping(value = "/addSeethaData")
	public ResponseEntity<SeethaObject> addSeethaDevi(@RequestBody SeethaObject obj) {
		seethaList.add(obj);
		System.out.println("Seethu...\nAdded successfully..");
		return new ResponseEntity<>(obj, HttpStatus.CREATED);
	}
	
	@GetMapping("/getSeethuData")
	public List<SeethaObject> getseethaDevi() {
		return seethaList;
	}
	
	
}
