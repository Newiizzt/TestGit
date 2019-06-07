package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/")
public class MenuController {
	///@PostMapping(value = "/getMenuById", produces= {MediaType.APPLICATION_JSON_VALUE}, consumes= {MediaType.APPLICATION_JSON_VALUE})
	//public @ResponseBody AbsResponseModel getMenuById(HttpServletRequest request, HttpServletResponse response, 
	//@RequestBody GetMenuRequestModel requestMsg) throws Exception {

	//GetMenuResponseModel getMenuResponseModel = new GetMenuResponseModel();
	//getMenuResponseModel.setMenu(menuHelper.getMenuById(requestMsg.getMenuId()));
	//return getMenuResponseModel;
	//}
	
	
	//create controller
	@GetMapping(value="/getStringMsg")
	public String getStringMsg() {
		return "test";
	}

}
