package com.ram.ms.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ram.ms.dto.OrderResponseDTO;

@Component
public class CabServiceClient {
    @Autowired
    private RestTemplate template;

    public OrderResponseDTO fetchOrderStatus(String orderId) {
        return template.getForObject("http://CAB-APP/cab/orders/status/" + orderId, OrderResponseDTO.class);
    }
}
