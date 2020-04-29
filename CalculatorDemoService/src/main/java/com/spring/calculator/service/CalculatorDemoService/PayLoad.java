package com.spring.calculator.service.CalculatorDemoService;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class PayLoad {

	private String num1;
	private String num2;
	private String operation;
	private int resultSeq;
	
	public int getResultSeq() {
		return resultSeq;
	}

	public void setResultSeq(int resultSeq) {
		this.resultSeq = resultSeq;
	}

	public PayLoad() {
		super();
	}

	public String getNum1() {
		return num1;
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public String getNum2() {
		return num2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
   
}
