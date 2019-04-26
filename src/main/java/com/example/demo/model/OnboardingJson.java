package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OnboardingJson {
	
	@JsonProperty("root")
    private Root root;

	@Override
	public String toString() {
		return "OnboardingJson [root=" + root + "]";
	}
	
	
	

}
