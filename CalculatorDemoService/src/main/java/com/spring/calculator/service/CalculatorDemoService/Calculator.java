package com.spring.calculator.service.CalculatorDemoService;

public class Calculator {

	String operation;
	
	public Calculator(String operation) {
		this.operation = operation;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public double substract(double a, double b) {
		return a-b;
	}
	
	public double division(double a,  double b) {
		return a/b;
	} 
}
