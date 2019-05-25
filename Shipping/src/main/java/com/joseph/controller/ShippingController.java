package com.joseph.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joseph.model.Shipping;
import com.joseph.service.ShippingService;

@Controller
public class ShippingController {
	@Autowired
	private ShippingService shippingService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map) {
		Shipping shipping = new Shipping();
		map.put("shipping", shipping);
		map.put("shippingList", shippingService.getAllShipping());
		return "shipping";
	}
	@RequestMapping(value="/student.do",method=RequestMethod.POST)
	public String doActions(@ModelAttribute Shipping shipping, BindingResult result, @RequestParam String action, Map<String, Object> map) {
		Shipping shippingResult = new Shipping();
		switch(action.toLowerCase()){ //only in java 7
		
		case "add":
			shippingService.add(shipping);
			shippingResult = shipping;
			break;
			
		case "edit":
			shippingService.edit(shipping);
			shippingResult = shipping;
			break;
			
		case "delete":
			shippingService.delete(shipping.getShippingId());
			shippingResult = new Shipping();
			break;
			
		case "search":
			Shipping searchShipping = shippingService.getShipping(shipping.getShippingId());
			shippingResult = searchedShipping! = null ? searchedShipping : new Shipping();
			break;
		}
		map.put("shipping", shippingResult);
		map.put("shippingList", shippingService.getAllShipping());
		return "shipping";
		
	}
	
}
