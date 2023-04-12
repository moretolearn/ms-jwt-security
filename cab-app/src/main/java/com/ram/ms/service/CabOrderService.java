package com.ram.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.ms.dao.OrderResponseDTO;
import com.ram.ms.dto.CabOrderDao;

@Service
public class CabOrderService {
	@Autowired
	private CabOrderDao orderDAO;

	public String greeting() {
		return "Welcome to Cab service";
	}

	public OrderResponseDTO getOrder(String orderId) {
		return orderDAO.getOrders(orderId);
	}
}