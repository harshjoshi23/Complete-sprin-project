package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Payment;
import com.example.demo.services.PaymentService;

@Controller
public class PaymentController {
	private Payment payment ; 
	
	@Autowired
	private PaymentService service; 
	
	private PaymentController(Payment payment) {
		this.payment = payment ; 
	}
	
	@RequestMapping(path = "/payment", method = RequestMethod.GET)
	public String initPage(Model model) {
		model.addAttribute("command" , payment) ; 
		return "add-payment" ; 
	}
	
	@RequestMapping(path = "/payment", method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("command") Payment obj, Model model) {
		this.service.save(obj) ; 
		model.addAttribute("message", "one record added!") ; 
		return "add-payment";
	}
	
	@RequestMapping(path = "/payment/search", method = RequestMethod.GET)
	public String initSearchPage() {
		return "search" ; 
	}
	
	@RequestMapping(path = "/payment/search/byId", method = RequestMethod.POST)
	public String handleSearchById(@RequestParam(name = "paymentId") int id, Model model) {
		model.addAttribute("payment" , this.service.findById(id)) ; 
		return "search" ; 
	}
	
	@RequestMapping(path = "/payment/search/byCustomerName", method = RequestMethod.POST)
	public String handleSearchByCustomer(@RequestParam(name = "customerName") String name, Model model) {
		model.addAttribute("payments" , this.service.findByCustomerName(name)) ; 
		return "search" ; 
	}
	
}
