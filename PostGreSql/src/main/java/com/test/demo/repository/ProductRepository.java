package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.demo.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
