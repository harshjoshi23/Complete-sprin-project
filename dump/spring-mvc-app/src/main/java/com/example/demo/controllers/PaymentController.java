package com.example.demo.controllers;

import com.example.demo.entity.*;
import com.example.demo.services.PaymentService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import com.example.demo.model.Payment;

@Controller
public class PaymentController {

	private Payment payment;
	
	private PaymentService service = new PaymentService();

	public PaymentController(Payment payment) {
		super();
		this.payment = payment;
	}

//	@RequestMapping(path="/", method = RequestMethod.GET)
	@RequestMapping(path = "/payment", method = RequestMethod.GET)
	public String initPage(Model model) {
		model.addAttribute("command", payment);
		return "add-payment";
	}

	@RequestMapping(path = "/payment", method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("command") Payment payment) {
//		model.addAttribute("command","payment");
		this.service.save(payment);
		System.out.println(payment);
		return "index";
	}
	@RequestMapping(path="/payment/srch", method = RequestMethod.GET)
	public String initSearchPage() {
		return "search";
	}
	
	@RequestMapping(path="/payment/srch", method= RequestMethod.POST)
		public String onSearch(@RequestParam("paymentId") int paymentId) {

			System.out.println(paymentId);
		return "index";
	}

}
