package com.garden.garden_mono.service;

import com.garden.garden_mono.dto.ItemDto;
import com.garden.garden_mono.dto.OrderRequest;
import com.garden.garden_mono.model.Item;
import com.garden.garden_mono.model.Order;
import com.garden.garden_mono.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void createOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setNumber(UUID.randomUUID().toString());
        List<Item> items = orderRequest.getOrderItems()
                .stream()
                .map(this::mapToItems)
                .toList();
        order.setOrderItems(items);

        orderRepository.save(order);
    }

    private Item mapToItems(ItemDto item) {
        return Item.builder()
                .price(item.getPrice())
                .quantity(item.getQuantity())
                .code(item.getCode())
                .build();
    }
}
