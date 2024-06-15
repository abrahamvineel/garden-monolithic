package com.garden.garden_mono.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ItemDto {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Integer quantity;
    private String name;
    private String type;
    private String skuCode;
    private Double price;
}
