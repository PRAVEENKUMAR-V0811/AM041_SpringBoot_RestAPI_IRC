package com.java.pet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.pet.Model.Pet;

public interface PetRepo  extends JpaRepository<Pet,Integer>{
    
}