package com.spring.calculator.service.CalculatorDemoService;

public class Addition implements MethodCall{

	Calculator c;
	public Addition(Calculator c) {
		this.c = c;
	}
	@Override
	public double execute(double a, double b) {
		// TODO Auto-generated method stub
		
		return a+b;
	}

}
