package com.garden.garden_mono.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Item {

    @Id
    private Long id;
    private Integer quantity;
    private String code;
    private Double price;
}