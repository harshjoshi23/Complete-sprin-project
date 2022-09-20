package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Payment;
import com.example.demo.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository repo ; 
	public Payment save(Payment entity) {
		return this.repo.save(entity) ; 
	}
	public List<Payment> findAll(){
		return this.repo.findAll() ; 
	}
	public Optional<Payment> findById(int id) {
		return this.repo.findByPaymentId(id) ; 
	}
	public List<Payment> findByCustomerName(String customerName){
		return this.repo.findByCustomerName(customerName) ; 
	}
}
