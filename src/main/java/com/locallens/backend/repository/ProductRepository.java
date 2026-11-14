package com.locallens.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.locallens.backend.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {