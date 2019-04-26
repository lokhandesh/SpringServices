package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceResponseHeader {

	@JsonProperty("responseContext")
    private ResponseContext responseContext;

	public ResponseContext getResponseContext() {
		return responseContext;
	}

	public void setResponseContext(ResponseContext responseContext) {
		this.responseContext = responseContext;
	}

	@Override
	public String toString() {
		return "ServiceResponseHeader [responseContext=" + responseContext + "]";
	}
	
	
	
	
}
