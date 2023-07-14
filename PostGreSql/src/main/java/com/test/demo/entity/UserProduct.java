package com.test.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserProduct")
public class UserProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="Id")
    private long id;

    @Column(name="UserId")
    private long uid;

    @Column(name="ProductId")
    private long pid;

    public UserProduct(){

    }

    public UserProduct(long id, long userId, long productId){
        this.id = id;
        this.uid = userId;
        this.pid = productId;
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return this.id;
    }

    public long getUid(){
        return this.uid;
    }

    public void setUid(long id){
        this.uid = id;
    }

    public long getPid(){
        return this.pid;
    }

    public void setPid(long id){
        this.pid = id;
    }

}
