package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.service.PartyService;
import com.example.demo.model.common.AbsResponseModel;
import com.example.demo.model.party.response.GetAllPartyResponse;

@RestController
@RequestMapping(value="/api/party")
public class PartyController {
	
//if want to Post
//produces > want to return Json value
//Have request add comsumes=
	//@PostMapping(value = "/getMenuById", produces= {MediaType.APPLICATION_JSON_VALUE}, consumes= {MediaType.APPLICATION_JSON_VALUE})
	//public @ResponseBody AbsResponseModel getMenuById(HttpServletRequest request, HttpServletResponse response, 
//consumes with 
	//@RequestBody GetMenuRequestModel requestMsg) throws Exception {

	//GetMenuResponseModel getMenuResponseModel = new GetMenuResponseModel();
	//getMenuResponseModel.setMenu(menuHelper.getMenuById(requestMsg.getMenuId()));
	//return getMenuResponseModel;
	//}
	
	@Autowired
	private PartyService partyService;
	
//if want to Get	
	//create controller
	@GetMapping(value="/getAllParty", produces= {MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody AbsResponseModel getMenuByList(HttpServletRequest request, HttpServletResponse response) 
	 throws Exception {

		GetAllPartyResponse getAllPartyResponse = new GetAllPartyResponse();
		getAllPartyResponse.setPartylist(partyService.getAllParty());
	return getAllPartyResponse;
	}
	}
