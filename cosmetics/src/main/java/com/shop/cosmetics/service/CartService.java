package com.shop.cosmetics.service;

import com.shop.cosmetics.entity.Product;
import com.shop.cosmetics.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CartService {

    private final ProductRepository productRepository;

    // productId -> quantity
    private final Map<Product, Integer> cart = new HashMap<>();

    public CartService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // ✅ ОЦЕЙ МЕТОД ТИМ САМИМ ВИРІШУЄ ПОМИЛКУ
    public void addProduct(Long productId) {
        Product product = productRepository.findById(productId).orElseThrow();

        cart.put(product, cart.getOrDefault(product, 0) + 1);
    }

    public Map<Product, Integer> getItems() {
        return cart;
    }

    public double getTotal() {
        return cart.entrySet()
                .stream()
                .mapToDouble(e -> e.getKey().getPrice() * e.getValue())
                .sum();
    }
}
