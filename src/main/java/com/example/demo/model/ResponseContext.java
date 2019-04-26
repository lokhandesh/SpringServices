package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseContext {
	
	@JsonProperty("statusCode")
    private String statusCode;
	
    @JsonProperty("statusDescription")
    private String statusDescription;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	@Override
	public String toString() {
		return "ResponseContext [statusCode=" + statusCode + ", statusDescription=" + statusDescription + "]";
	}
	
	

}
