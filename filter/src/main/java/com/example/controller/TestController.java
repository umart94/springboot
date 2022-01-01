package com.example.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	private static final Logger LOGGER = LogManager.getLogger(TestController.class);
	
	@RequestMapping(value = "/")
	   public String hello() {
		LOGGER.debug("HELLO WORLD FROM APACHE LOG4J2");
	      return "Hello World";
	   }

}
