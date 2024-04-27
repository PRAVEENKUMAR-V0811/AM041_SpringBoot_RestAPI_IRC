package com.java.pet.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.pet.Model.User;
import com.java.pet.Service.CustService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("api/customer")
public class CustController {
    @Autowired
    private CustService custService;
    @GetMapping("/customers")
    public java.util.List<User> getCustomers(){
        return custService.getAllDetails();
    }
    @PostMapping("/add")
    public User postDetails(@RequestBody User user) {
        
        
        return custService.saveDetails(user);
    }
    @GetMapping("/get")
    
    
    public java.util.List<User> getDetails(){
        return custService.getAllDetails();
    }
    @PutMapping("update/{Id}")
    public ResponseEntity<User> updateProduct(@PathVariable int Id, @RequestBody User updateRequest) {
        User updated = custService.updateProduct(Id, updateRequest);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteuserDetails(@PathVariable int id){
        return custService.deleteDetail(id);
    }
    
    
}