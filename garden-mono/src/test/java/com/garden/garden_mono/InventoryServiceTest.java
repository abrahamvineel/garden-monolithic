package com.garden.garden_mono;

import com.garden.garden_mono.model.Inventory;
import com.garden.garden_mono.repository.InventoryRepository;
import com.garden.garden_mono.service.InventoryService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class InventoryServiceTest {

    @Mock
    private InventoryRepository inventoryRepository;

    @Test
    public void testIsInStock() {
        String skuCode = "ABC123";
        Mockito.when(inventoryRepository.findBySkuCode(skuCode)).thenReturn(Optional.of(new Inventory()));

        InventoryService inventoryService = new InventoryService(inventoryRepository);
        boolean result = inventoryService.isInStock(skuCode);

        assertTrue(result, "Item should be in stock");
    }
}
