package com.spring.calculator.service.CalculatorDemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OperationOutput {
	
	@Autowired
	private PayLoad payload;
	@Autowired
	private Response response;

	public PayLoad getPayload() {
		return payload;
	}
	public void setPayload(PayLoad payload) {
		this.payload = payload;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response resp) {
		this.response = resp;
	}

	public OperationOutput(PayLoad payload, Response resp) {
		super();
		this.payload = payload;
		this.response = resp;
	}
}
