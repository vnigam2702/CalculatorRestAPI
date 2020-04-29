package com.spring.calculator.service.CalculatorDemoService;

import org.springframework.stereotype.Component;

@Component
public class Response {

	private String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}
