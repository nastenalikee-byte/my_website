package com.shop.cosmetics.repository;

import com.shop.cosmetics.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}