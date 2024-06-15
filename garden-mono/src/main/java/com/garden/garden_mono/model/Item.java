package com.garden.garden_mono.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import jakarta.persistence.Id;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Integer quantity;
    private String name;
    private String type;
    private String skuCode;
    private Double price;
}
