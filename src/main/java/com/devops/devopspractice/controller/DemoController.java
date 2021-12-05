package com.devops.devopspractice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class DemoController {
	
	@RequestMapping("/demo")
	public String testMethod() {
		
		return "Welcome to spring boot Demo App, Good know about DevOps.....";
	}
	
	@RequestMapping("/computerMakers")
	public List<String> ListOfComputerMaker() {
		
		List<String> list = new ArrayList<>();
		list.add("Dell");
		list.add("Lenono");
		list.add("HCL");
		list.add("Samsung");
		list.add("Thoshiba");
		list.add("HP");
		list.add("ASCS");
		list.add("Apple");
		list.add("TCL");
		list.add("IBM");
		
		return list;
	}
	
}