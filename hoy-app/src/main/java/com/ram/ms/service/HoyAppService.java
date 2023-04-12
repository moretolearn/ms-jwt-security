package com.ram.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.ms.client.CabServiceClient;
import com.ram.ms.dto.OrderResponseDTO;

@Service
public class HoyAppService {
	
	 @Autowired
	    private CabServiceClient cabServiceClient;

	    public String greeting() {
	        return "Welcome to Hoy App Service";
	    }

	    public OrderResponseDTO checkOrderStatus(String orderId) {
	        return cabServiceClient.fetchOrderStatus(orderId);
	    }
}
