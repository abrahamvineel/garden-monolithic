package com.garden.garden_mono.repository;

import com.garden.garden_mono.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
