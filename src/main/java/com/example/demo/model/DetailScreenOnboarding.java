package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetailScreenOnboarding {
	
	 	@JsonProperty("onboard-screen")
	    private List<OnboardScreen> onboardScreen;

		public List<OnboardScreen> getOnboardScreen() {
			return onboardScreen;
		}

		public void setOnboardScreen(List<OnboardScreen> onboardScreen) {
			this.onboardScreen = onboardScreen;
		}

		@Override
		public String toString() {
			return "DetailScreenOnboarding [onboardScreen=" + onboardScreen + "]";
		}
	 	
	 	
	 	
	 	

}
