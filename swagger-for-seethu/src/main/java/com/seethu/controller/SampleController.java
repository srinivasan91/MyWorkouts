package com.seethu.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.seethu.model.SeethaObject;
import com.seethu.service.LoadDataService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/seetha/api")
@CrossOrigin
public class SampleController {
	
//	List<SeethaObject> seethaList = new ArrayList<>();
	
	@Autowired
	private LoadDataService loadDataService;

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
//	@RequestMapping(value = "/addSeethaData", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SeethaObject> addSeethaDevi(@RequestBody SeethaObject obj) {
		loadDataService.getSeethuList().add(obj);
		System.out.println(obj.getName() + "\n" + obj.getEmployer() + "\n" + obj.getSalary());
		System.out.println("Seethu...\nAdded successfully..");
		return new ResponseEntity<>(obj, HttpStatus.CREATED);
	}
	
	@GetMapping("/getSeethuData")
	public List<SeethaObject> getseethaDevi() {
		return loadDataService.getSeethuList();
	}
	
	@DeleteMapping("/deleteSeethuData")
	public ResponseEntity<String> deleteSeethaDevi(@RequestBody SeethaObject obj) {
		Iterator i = loadDataService.getSeethuList().iterator();
		while (i.hasNext()) {
			SeethaObject iterObj = (SeethaObject) i.next(); 
			if((iterObj.getName()).equals(obj.getName())) {
				i.remove();
			}
		}
		System.out.println(obj.getName() + "\n" + obj.getEmployer() + "\n" + obj.getSalary());
		System.out.println("Seethu...\nDeleted successfully..");
		return new ResponseEntity<>("Deleted successfully..", HttpStatus.ACCEPTED);
	}
}
