package com.example;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping(value = "/")
public class DemoApplicationController {
	
	private static Logger LOGGER = Logger.getLogger(DemoApplicationController.class);
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public String greetings(){
		return "Hello World";
	}

}
