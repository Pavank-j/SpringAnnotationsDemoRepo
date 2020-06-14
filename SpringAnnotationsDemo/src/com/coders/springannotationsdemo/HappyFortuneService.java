package com.coders.springannotationsdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is gonna be our lucky day! We are going to learn about annotations in spring";
	}

}
