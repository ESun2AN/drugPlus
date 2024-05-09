package com.admin.layout.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;







@Controller
public class testController {

	@GetMapping("/")
	public String home(Model model) throws Exception {

		return "main";
	}
	


	
//	결제 환불 장바구니
	@GetMapping("/payAndmarket/history")
	public String history() {
		return "payAndmarket/history";
	}
	@GetMapping("/payAndmarket/pay")
	public String pay() {
		return "payAndmarket/pay";
	}
	@GetMapping("/payAndmarket/shoppingbasket")
	public String shoppingBasket() {
		
		return "payAndmarket/shoppingbasket";
	}
	@GetMapping("/payAndmarket/return")
	public String Return() {
		return "payAndmarket/return";
	}
	
	
	@GetMapping("/map")
	public String map() {
		return "map/map";
	}
	
}
