package com.spring.calculator.service.
CalculatorDemoService.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.calculator.service.CalculatorDemoService.MethodCall;
import com.spring.calculator.service.CalculatorDemoService.OperationOutput;
import com.spring.calculator.service.CalculatorDemoService.PayLoad;
import com.spring.calculator.service.CalculatorDemoService.ReplaySeq;
import com.spring.calculator.service.CalculatorDemoService.Response;
import com.spring.calculator.service.CalculatorDemoService.RetreiveResult;

@Service
public class CalculateService {

	@Autowired
	private PayLoad payload;
	@Autowired
	private Response response;
	@Autowired
	private OperationOutput output;
	@Autowired
	private RetreiveResult retResult;
	@Autowired
	private ReplaySeq replaySeq;
	//@Autowired
	//MethodCall caller;
	
	
	private static Map<Integer,String> seqMap = new HashMap();
	private static int seq = 1;
	
	public OperationOutput calculate(String a, String b, String operation) {
		
		double result = 0;
		payload.setNum1(a);
		payload.setNum2(b);
		payload.setOperation(operation);
		output.setPayload(payload);
		
		//validating input params
		if(!validateParam(a,b))
		{
			response.setResult("either of the param is invalid");
			output                   .setResponse(response);
			seqMap.put(seq, response.getResult());
			seq++;
			return output;
		}
		/*if (operation.equalsIgnoreCase("add")) {
			
			result  = Double.parseDouble(a) + Double.parseDouble(b);
			response.setResult("Sum of "+a+" and "+b+" is "+result);
		}
			
		else if (operation.equalsIgnoreCase("substract")) {
			result  = Double.parseDouble(a) - Double.parseDouble(b);
			response.setResult("subs of "+a+" and "+b+" is "+result);
		}
	               	
		else if (operation.equalsIgnoreCase("divide")) {
			result  = Double.parseDouble(a) / Double.parseDouble(b);
			response.setResult("division of "+a+" and "+b+" is "+result);
		}
		
		else if (operation.equalsIgnoreCase("modulo")) {
			result  = Double.parseDouble(a) % Double.parseDouble(b);
			response.setResult("modulo of "+a+" and "+b+" is "+result);
		}
			
		else {
			result = Double.parseDouble(a) * Double.parseDouble(b);
			response.setResult("product of "+a+" and "+b+" is "+result);
		}*/
		
		seqMap.put(seq, response.getResult());
		seq++;	
		output.setPayload(payload);
		output.setResponse(response);
		return output;
		
    }
	
	private boolean validateParam(String num1,String num2) {
		String pattern = "[-+]?[0-9]*\\.?[0-9]+$";
		if("".equals(num1) || num1 == null || !num1.matches(pattern) || "".equals(num2) || num2== null|| !num2.matches(pattern))
		   return false;
		
		return true;
	}
	
	public RetreiveResult getPrevOperationResult(int resultSeq) {
		replaySeq.setReplaySeq(resultSeq);
		String result = seqMap.get(resultSeq);
		response.setResult(result);
		retResult.setReplaySeq(replaySeq);
		retResult.setResult(response);
		return retResult;
		
		/*PayLoad o = new PayLoad();
		o.setResultSeq(resultSeq);
		output.setPayload(o);
		String result = seqMap.get(resultSeq);
		response.setResult(result);
		output.setResponse(response);
		return output;*/
		
	}
}
