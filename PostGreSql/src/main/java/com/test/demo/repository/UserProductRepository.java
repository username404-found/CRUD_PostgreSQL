package com.test.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.demo.entity.UserProduct;


public interface UserProductRepository extends JpaRepository<UserProduct, Long>{

    public List<UserProduct> findBypid(long pid);

    public List<UserProduct> findByuid(long uid);

}