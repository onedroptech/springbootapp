package com.banana.tech.SpringBootApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController 
{

	@GetMapping(path="/getsms")
	public String getOTP() 
	{
		return "SUCCESS";
	}
}
