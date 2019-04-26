package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {

	@JsonProperty("detail-screen")
    private DetailScreenOnboarding detailScreen;
	
    @JsonProperty("screen-type")
    private String screenType;
    
    @JsonProperty("locale")
    private String locale;
    
    @JsonProperty("copy-dcr")
    private String copyDcr;

	public DetailScreenOnboarding getDetailScreen() {
		return detailScreen;
	}

	public void setDetailScreen(DetailScreenOnboarding detailScreen) {
		this.detailScreen = detailScreen;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getCopyDcr() {
		return copyDcr;
	}

	public void setCopyDcr(String copyDcr) {
		this.copyDcr = copyDcr;
	}

	@Override
	public String toString() {
		return "Root [detailScreen=" + detailScreen + ", screenType=" + screenType + ", locale=" + locale + ", copyDcr="
				+ copyDcr + "]";
	}
	
    
    
    
	
}
