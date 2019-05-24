package com.cubic.orderOpalCard.resources;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.text.ParseException;

import com.cubic.orderOpalCard.model.OpalCard;
import com.cubic.orderOpalCard.model.Payment;
import com.cubic.orderOpalCard.model.UserDetails;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

@RestController
@RequestMapping(value = "opalCard/")
@CrossOrigin
public class OrderOpalCardResource {
	
	@Autowired
	private OpalCardServices opalCardServices;
	
	@RequestMapping(value = "order", method = RequestMethod.POST)
	public ResponseEntity<?> orderOpalCard(@RequestBody String jsonObj, HttpServletRequest request)
			throws ParseException {
		try {
			JsonElement objData = new JsonParser().parse(jsonObj);
			UserDetails userDetails = new Gson().fromJson(objData, UserDetails.class);
			Boolean isSuccess = opalCardServices.orderOpalCard(userDetails);
		    return ResponseEntity.ok().body(isSuccess);				 
		  
		}catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
	}
	
	@RequestMapping(value = "payment", method = RequestMethod.POST)
	public ResponseEntity<?> makePaymentOpalCard(@RequestBody String jsonObj, HttpServletRequest request)
			throws ParseException {
		try {
			JsonElement objData = new JsonParser().parse(jsonObj);
			Payment payment = new Gson().fromJson(objData, Payment.class);
			Boolean isSuccess = opalCardServices.addPaymentDetails(payment);
		    return ResponseEntity.ok().body(isSuccess);				 
		  
		}catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
	}
	
	@RequestMapping(value = "createCard", method = RequestMethod.POST)
	public ResponseEntity<?> createOpalCard(@RequestBody String jsonObj, HttpServletRequest request)
			throws ParseException {
		try {
			JsonElement objData = new JsonParser().parse(jsonObj);
			OpalCard opalCard = new Gson().fromJson(objData, OpalCard.class);
			Boolean isSuccess = opalCardServices.addCardDetails(opalCard);
		    return ResponseEntity.ok().body(isSuccess);				 
		  
		}catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
	}
	
	@RequestMapping(value = "details", method = RequestMethod.GET)
	public ResponseEntity<?> retrieveOpalCardDetails(String username, HttpServletRequest request)
			throws ParseException {
	    OpalCard opalCard = null;
		try {
			opalCard = opalCardServices.GetOpalCardDetails(username);
			return ResponseEntity.ok().body(opalCard);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
	}
	
	
	
}
