package com.aws.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/aws/demo")
public class DemoController {

	@GetMapping(path = "/gateway")
	public String gateway() {
		return "Hello World! from EBS (thru CodePipeline)";
	}

}
