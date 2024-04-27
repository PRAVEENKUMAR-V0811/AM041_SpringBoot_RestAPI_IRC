package com.java.pet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.pet.Model.User;

public interface CustRepo  extends JpaRepository<User,Integer>{
    
}