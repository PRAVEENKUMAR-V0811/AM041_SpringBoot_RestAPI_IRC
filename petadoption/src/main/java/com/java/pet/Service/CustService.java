package com.java.pet.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.java.pet.Model.Pet;
import com.java.pet.Model.User;
import com.java.pet.Repository.CustRepo;

@Service
public class CustService {
    @Autowired
    private CustRepo custRepo;

    public User saveDetails(User user){
        return custRepo.save(user);
    }
    
    public java.util.List<User> getAllDetails(){
        return custRepo.findAll();
    }
    
     public User updateProduct(int Id, @RequestBody User user) {
        return custRepo.findById(Id).map(existingUser -> {
            existingUser.setName(user.getName());
            existingUser.setAge(user.getAge());
            existingUser.setphonenumber(user.getphonenumber());
            existingUser.setEmail(user.getEmail());
            return custRepo.save(existingUser);
        }).orElseThrow(() -> new RuntimeException("User not found with this ID:" + Id));
    }
    public String deleteDetail(int id){
        if(custRepo.existsById(id)){
            
            custRepo.deleteById(id);
            return "deleted id: "+id;
        }
        else{
            return "id"+id+" not exists";
        }
    }
}