package com.garden.garden_mono.controller;

import com.garden.garden_mono.dto.OrderRequest;
import com.garden.garden_mono.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    public void placeOrder(@RequestBody OrderRequest request) {
        orderService.createOrder(request);
    }
}
