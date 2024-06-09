package com.garden.garden_mono.dto;

import com.garden.garden_mono.model.Item;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class OrderRequest {

    private List<ItemDto> orderItems;
}
