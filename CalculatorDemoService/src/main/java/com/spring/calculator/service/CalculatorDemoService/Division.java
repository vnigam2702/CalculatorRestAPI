package com.spring.calculator.service.CalculatorDemoService;

public class Division implements MethodCall{

	private Calculator c;
	public Division(Calculator c) {
		this.c = c;
	}
	@Override
	public double execute(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
