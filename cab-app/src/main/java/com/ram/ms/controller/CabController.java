package com.ram.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.ms.dao.OrderResponseDTO;
import com.ram.ms.service.CabOrderService;

@RestController
@RequestMapping("/cab")
public class CabController {

    @Autowired
    private CabOrderService service;

    @GetMapping("/home")
    public String greetingMessage() {
        return service.greeting();
    }

    @GetMapping("/orders/status/{orderId}")
    public OrderResponseDTO getOrder(@PathVariable String orderId) {
        return service.getOrder(orderId);
    }
}