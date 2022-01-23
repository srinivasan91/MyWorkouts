package com.seethu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SeethaObject {
	
	@JsonProperty("name")
	private String name;
	@JsonProperty("employer")
	private String employer;
	@JsonProperty("salary")
	private Long salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployer() {
		return employer;
	}
	
	public SeethaObject(String name, String employer, Long salary) {
		super();
		this.name = name;
		this.employer = employer;
		this.salary = salary;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	

}
