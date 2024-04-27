package com.java.pet.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data

@Entity
@Table(name="Pet_Details")
@NoArgsConstructor
public class Pet {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name="pet_name")
    private String pet_name;
    @Column(name="pet_age")
    private int pet_age;
    @Column(name="pet_type")
    private String pet_type;
    @Column(name="pet_comments")
    private String pet_comments;
    public Pet(String pet_name, int pet_age, String pet_type, String pet_comments) {
        this.pet_name = pet_name;
        this.pet_age = pet_age;
        this.pet_type = pet_type;
        this.pet_comments = pet_comments;
    }
    
    public String getpet_name() {
        return pet_name;
    }
    public void setpet_name(String pet_name) {
        this.pet_name = pet_name;
    }
    public int getpet_age() {
        return pet_age;
    }
    public void setpet_age(int pet_age) {
        this.pet_age = pet_age;
    }
    public String getpet_type() {
        return pet_type;
    }
    public void setpet_type(String pet_type) {
        this.pet_type = pet_type;
    }
    public String getpet_comments() {
        return pet_comments;
    }
    public void setpet_comments(String pet_comments) {
        this.pet_comments = pet_comments;
    }
    
}
