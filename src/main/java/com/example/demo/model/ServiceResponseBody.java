package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceResponseBody {

	@JsonProperty("baseUrl")
    private String baseUrl;
	
    @JsonProperty("cmsContent")
    private CmsContent cmsContent;

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public CmsContent getCmsContent() {
		return cmsContent;
	}

	public void setCmsContent(CmsContent cmsContent) {
		this.cmsContent = cmsContent;
	}

	@Override
	public String toString() {
		return "ServiceResponseBody [baseUrl=" + baseUrl + ", cmsContent=" + cmsContent + "]";
	}
	
    
    
    
	
}
