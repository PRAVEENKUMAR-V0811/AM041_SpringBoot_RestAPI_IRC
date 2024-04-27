package com.java.pet.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.pet.Model.Pet;
import com.java.pet.Service.PetService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("api/pet")
public class PetController {
    @Autowired
    private PetService petService;
    @GetMapping("/pet_deatils")
    public List<Pet> getpet(){
        return petService.getAllDetails();
    }
    @PostMapping("/add")
    public Pet postDetails(@RequestBody Pet Pet) {
        
        
        return petService.saveDetails(Pet);
    }
    @GetMapping("/get")
    
    
    public List<Pet> getDetails(){
        return petService.getAllDetails();
    }
    @PutMapping("update/{Id}")
    public ResponseEntity<Pet> updateProduct(@PathVariable int Id, @RequestBody Pet updateRequest) {
        Pet updated = petService.updateProduct(Id, updateRequest);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteuserDetails(@PathVariable int id){
        return petService.deleteDetail(id);
    }
    
    
}