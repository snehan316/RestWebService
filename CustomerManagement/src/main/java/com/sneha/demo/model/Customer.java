package com.sneha.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	private long id;
	private String name;
	private String company;
	
	public Customer() {
		
	}
		

	public Customer(long id, String name, String company) {
		this.id = id;
		this.name = name;
		this.company = company;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
