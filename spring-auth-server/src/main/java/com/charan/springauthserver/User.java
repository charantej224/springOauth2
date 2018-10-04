package com.charan.springauthserver;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	
	@JsonProperty("ID")
	private Long id;
	@JsonProperty("Name")
	private String name;
	@JsonProperty("Address")
	private String address;
	
	
	public User() {
		super();
	}
	
	public User(Long id, String name, String address) {
		super();
		this.id  = id;
		this.name = name;
		this.address = address;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
