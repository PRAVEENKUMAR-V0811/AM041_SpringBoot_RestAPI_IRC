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
@Table(name="Customer_Details")
@NoArgsConstructor
public class User {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name="customer_name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="phone_number")
    private long phonenumber;
    @Column(name="customer_email")
    private String email;
    public User(int phonenumber, String email, String name, int age) {
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getphonenumber() {
        return phonenumber;
    }
    public void setphonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
