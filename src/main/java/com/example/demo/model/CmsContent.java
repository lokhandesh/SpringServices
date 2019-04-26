package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CmsContent {

	 	@JsonProperty("langPageJson")
	    private LangPageJson langPageJson;
	    @JsonProperty("onboardingJson")
	    private OnboardingJson onboardingJson;
	    
	    
		public LangPageJson getLangPageJson() {
			return langPageJson;
		}
		public void setLangPageJson(LangPageJson langPageJson) {
			this.langPageJson = langPageJson;
		}
		public OnboardingJson getOnboardingJson() {
			return onboardingJson;
		}
		public void setOnboardingJson(OnboardingJson onboardingJson) {
			this.onboardingJson = onboardingJson;
		}
		@Override
		public String toString() {
			return "CmsContent [langPageJson=" + langPageJson + ", onboardingJson=" + onboardingJson + "]";
		}

	    
	    
	    
}
