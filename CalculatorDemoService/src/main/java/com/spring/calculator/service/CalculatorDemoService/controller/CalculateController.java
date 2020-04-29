package com.spring.calculator.service.CalculatorDemoService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.calculator.service.CalculatorDemoService.OperationOutput;
import com.spring.calculator.service.CalculatorDemoService.RetreiveResult;
import com.spring.calculator.service.CalculatorDemoService.service.CalculateService;

@RestController
public class CalculateController {

	@Autowired
	private CalculateService svc;
	@GetMapping ("/calculate")
	public OperationOutput returnCalculatedResult(@RequestParam(defaultValue = "0") String a, @RequestParam(defaultValue = "0") String b, @RequestParam String operation) {
		return svc.calculate(a, b, operation);
	}
	
	@GetMapping("/result")
	public RetreiveResult returnPrevOperationResult(@RequestParam int seq) {
		return svc.getPrevOperationResult(seq);
	}
}
