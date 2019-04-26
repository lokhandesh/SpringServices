package com.example.demo.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OnboardScreen{
	
	
	@JsonProperty("screen-image")
    private String screenImage;
	
    @JsonProperty("text-color-blue")
    private Integer textColorBlue;
    
    @JsonProperty("message-title")
    private String messageTitle;
    
    @JsonProperty("text-color-red")
    private Integer textColorRed;
    
    @JsonProperty("message")
    private String message;
    
    @JsonProperty("background-shade")
    private String backgroundShade;
    
    @JsonProperty("text-color-green")
    private Integer textColorGreen;

	public String getScreenImage() {
		return screenImage;
	}

	public void setScreenImage(String screenImage) {
		this.screenImage = screenImage;
	}

	public Integer getTextColorBlue() {
		return textColorBlue;
	}

	public void setTextColorBlue(Integer textColorBlue) {
		this.textColorBlue = textColorBlue;
	}

	public String getMessageTitle() {
		return messageTitle;
	}

	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}

	public Integer getTextColorRed() {
		return textColorRed;
	}

	public void setTextColorRed(Integer textColorRed) {
		this.textColorRed = textColorRed;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getBackgroundShade() {
		return backgroundShade;
	}

	public void setBackgroundShade(String backgroundShade) {
		this.backgroundShade = backgroundShade;
	}

	public Integer getTextColorGreen() {
		return textColorGreen;
	}

	public void setTextColorGreen(Integer textColorGreen) {
		this.textColorGreen = textColorGreen;
	}

	@Override
	public String toString() {
		return "OnboardScreen [screenImage=" + screenImage + ", textColorBlue=" + textColorBlue + ", messageTitle="
				+ messageTitle + ", textColorRed=" + textColorRed + ", message=" + message + ", backgroundShade="
				+ backgroundShade + ", textColorGreen=" + textColorGreen + "]";
	}
	
	
    
    
    
    
    
    
    
    

}
