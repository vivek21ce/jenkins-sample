package com.sample.jenkin.sample.jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsSampleController {
	@GetMapping("/jenikin")
	public String sayHello() {
		return "Hello Jenkins! be Happy";
	}

}
