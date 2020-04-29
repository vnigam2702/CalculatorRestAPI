package com.spring.calculator.service.CalculatorDemoService;

import org.springframework.stereotype.Component;

@Component
public class ReplaySeq {

	private int replaySeq;

	public int getReplaySeq() {
		return replaySeq;
	}

	public void setReplaySeq(int replaySeq) {
		this.replaySeq = replaySeq;
	}
}
