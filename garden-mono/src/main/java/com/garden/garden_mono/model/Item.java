package com.garden.garden_mono.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Entity
public class Item {

    @Id
    private Long id;
    private Integer quantity;
    private String code;
    private Double price;
}
