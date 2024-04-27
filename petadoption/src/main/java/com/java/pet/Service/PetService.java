package com.java.pet.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.java.pet.Model.Pet;
import com.java.pet.Repository.PetRepo;

@Service
public class PetService {
    @Autowired
    private PetRepo petRepo;

    public Pet saveDetails(Pet pet){
        return petRepo.save(pet);
    }
    
    public List<Pet> getAllDetails(){
        return petRepo.findAll();
    }
    
    public Pet updateProduct(int Id, @RequestBody Pet pet) {
        return petRepo.findById(Id).map(existingUser -> {
            existingUser.setpet_name(pet.getpet_name());
            existingUser.setpet_age(pet.getpet_age());
            existingUser.setpet_type(pet.getpet_type());
            existingUser.setpet_comments(pet.getpet_comments());
            return petRepo.save(existingUser);
        }).orElseThrow(() -> new RuntimeException("User not found with this ID:" + Id));
    }
    public String deleteDetail(int id){
        if(petRepo.existsById(id)){
            
            petRepo.deleteById(id);
            return "deleted id: "+id;
        }
        else{
            return "id"+id+" not exists";
        }
    }
}