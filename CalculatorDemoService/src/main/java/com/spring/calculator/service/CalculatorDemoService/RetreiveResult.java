package com.spring.calculator.service.CalculatorDemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RetreiveResult {

   @Autowired
   private ReplaySeq replaySeq;
   @Autowired	
   private Response result;
  
public Response getResult() {
	return result;
}
public void setResult(Response result) {
	this.result = result;
}
public ReplaySeq getReplaySeq() {
	return replaySeq;
}
public void setReplaySeq(ReplaySeq replaySeq) {
	this.replaySeq = replaySeq;
}
}
