package com.sample.conference.model;

import javax.validation.constraints.NotEmpty;

public class Registration {

	private String name;

	@NotEmpty
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
