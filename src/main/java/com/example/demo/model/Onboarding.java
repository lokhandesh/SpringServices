package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Onboarding {

	 	@JsonProperty("serviceResponseHeader")
	    private ServiceResponseHeader serviceResponseHeader;
	 	
	    @JsonProperty("serviceResponseBody")
	    private ServiceResponseBody serviceResponseBody;

		public ServiceResponseHeader getServiceResponseHeader() {
			return serviceResponseHeader;
		}

		public void setServiceResponseHeader(ServiceResponseHeader serviceResponseHeader) {
			this.serviceResponseHeader = serviceResponseHeader;
		}

		public ServiceResponseBody getServiceResponseBody() {
			return serviceResponseBody;
		}

		public void setServiceResponseBody(ServiceResponseBody serviceResponseBody) {
			this.serviceResponseBody = serviceResponseBody;
		}

		@Override
		public String toString() {
			return "Onboarding [serviceResponseHeader=" + serviceResponseHeader + ", serviceResponseBody="
					+ serviceResponseBody + "]";
		}
	
	
}
