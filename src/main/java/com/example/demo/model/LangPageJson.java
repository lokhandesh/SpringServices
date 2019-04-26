package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LangPageJson {

	@JsonProperty("root")
    private Root root;

	public Root getRoot() {
		return root;
	}

	public void setRoot(Root root) {
		this.root = root;
	}

	@Override
	public String toString() {
		return "LangPageJson [root=" + root + "]";
	}

	
	
	
}
