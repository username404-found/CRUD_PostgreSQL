package com.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.entity.Product;
import com.test.demo.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    public Iterable<Product> getAllProduct() {
        return repository.findAll();
    }

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public Product getProduct(long id) {
        Product product = repository.findById(id).orElse(null);
        return product;
    }

    public Product deleteProduct(long id) {
        Product deleteProduct = repository.findById(id).orElse(null);
        if (repository.existsById(id)){
            repository.deleteById(id);
        }
        return deleteProduct;
    }
}