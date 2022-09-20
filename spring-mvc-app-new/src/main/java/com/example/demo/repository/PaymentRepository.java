package com.example.demo.repository; 

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	public Optional<Payment> findByPaymentId(int paymentId);
	public List<Payment> findByCustomerName(String customerName);
}

