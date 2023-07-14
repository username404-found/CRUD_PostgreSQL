package com.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.entity.Product;
import com.test.demo.entity.User;
import com.test.demo.entity.UserProduct;
import com.test.demo.service.UserProductService;

@RestController
public class UserProductController {

    @Autowired
    private UserProductService userProductService;

    @PostMapping("/register")
    public UserProduct registerUser(@RequestBody UserProduct userProduct){
        return userProductService.addUserProduct(userProduct);
    }

    @GetMapping("/getUserProducts")
    public Iterable<UserProduct> getUsersByProductId(){
        return userProductService.getAllUserProduct();
    }

    @GetMapping("/getUsers/{productId}")
    public List<User> getUsersByProductId(@PathVariable long productId){
        return userProductService.UsersByProductId(productId);
    }

    @GetMapping("/getProducts/{userId}")
    public List<Product> getProductsByUserId(@PathVariable long userId){
        return userProductService.ProductByUserId(userId);
    }
    
}
