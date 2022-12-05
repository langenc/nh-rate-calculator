package com.nhratecalculator.nhratecalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.RateRequest;

@RestController
public class RateController {
	
	
	@PostMapping("/calcrate")
	public Double CalcRate(@RequestBody RateRequest rateRequest) {
		
		System.out.println(rateRequest.amount);
		System.out.println(rateRequest.roundFirstRate);
		System.out.println(rateRequest.months);
		
		return 0.0;
	}

}
