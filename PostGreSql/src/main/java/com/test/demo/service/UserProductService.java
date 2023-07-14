package com.test.demo.service;

import java.lang.Iterable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.entity.Product;
import com.test.demo.entity.User;
import com.test.demo.entity.UserProduct;
import com.test.demo.repository.UserProductRepository;

@Service
public class UserProductService {
    
    @Autowired
    private UserProductRepository repository;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    public UserProduct addUserProduct(UserProduct userProduct) {
        return repository.save(userProduct);
    }

    public List<User> UsersByProductId(long pid) {
        List<UserProduct> allUserProducts = repository.findBypid(pid);
        List<User> allUsers = new ArrayList<User>();
        allUserProducts.forEach(userProduct -> {
            allUsers.add(userService.getUser(userProduct.getUid()));
        });
        return allUsers;
    }

    public Iterable<UserProduct> getAllUserProduct() {
        return repository.findAll();
    }

    public List<Product> ProductByUserId(long uid) {
        List<UserProduct> allUserProducts = repository.findByuid(uid);
        List<Product> allProducts = new ArrayList<Product>();
        allUserProducts.forEach(userProduct -> {
            allProducts.add(productService.getProduct(userProduct.getPid()));
        });
        return allProducts;
    }

}
