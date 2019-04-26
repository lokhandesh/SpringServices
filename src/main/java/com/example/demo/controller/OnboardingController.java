package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.OnboardScreen;

@RestController
public class OnboardingController {
	
	
	static {
		
		ArrayList<OnboardScreen> list=new ArrayList<OnboardScreen>();
		
		OnboardScreen firstonboardScreen=new OnboardScreen();
		OnboardScreen secondonboardScreen=new OnboardScreen();
		OnboardScreen thirdonboardScreen=new OnboardScreen();

		
		firstonboardScreen.setScreenImage("/iwov-resources/images/tutorial/Slider_1.png");
		firstonboardScreen.setMessageTitle("Real-Time Business Tools");
		firstonboardScreen.setMessage("Real-time alerts on your favorite foreign exchange currencies.");
		firstonboardScreen.setBackgroundShade("dark");
		firstonboardScreen.setTextColorBlue(255);
		firstonboardScreen.setTextColorRed(255);
		firstonboardScreen.setTextColorRed(255);
		
		secondonboardScreen.setScreenImage("/iwov-resources/images/tutorial/Slider_1.png");
		secondonboardScreen.setMessageTitle("Real-Time Business Tools");
		secondonboardScreen.setMessage("Real-time alerts on your favorite foreign exchange currencies.");
		secondonboardScreen.setBackgroundShade("dark");
		secondonboardScreen.setTextColorBlue(255);
		secondonboardScreen.setTextColorRed(255);
		secondonboardScreen.setTextColorRed(255);
		
		
		thirdonboardScreen.setScreenImage("/iwov-resources/images/tutorial/Slider_1.png");
		thirdonboardScreen.setMessageTitle("Real-Time Business Tools");
		thirdonboardScreen.setMessage("Real-time alerts on your favorite foreign exchange currencies.");
		thirdonboardScreen.setBackgroundShade("dark");
		thirdonboardScreen.setTextColorBlue(255);
		thirdonboardScreen.setTextColorRed(255);
		thirdonboardScreen.setTextColorRed(255);
		
		
		list.add(firstonboardScreen);
		list.add(secondonboardScreen);
		list.add(thirdonboardScreen);

		
		
	}
	

}
