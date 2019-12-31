package com.barter.feedback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feedback")
public class FeedbackController {

	/*
	 * this method must be remove when start the development
	 * testing purpose only
	 */
	@GetMapping("/test")
	public String test() {
		return "success";
	}
}
