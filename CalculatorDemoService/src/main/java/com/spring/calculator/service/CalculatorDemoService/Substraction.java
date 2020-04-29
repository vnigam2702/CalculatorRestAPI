package com.spring.calculator.service.CalculatorDemoService;

public class Substraction implements MethodCall {

    private Calculator c;
	public Substraction(Calculator c) {
    	this.c = c;
    }
	@Override
	public double execute(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
