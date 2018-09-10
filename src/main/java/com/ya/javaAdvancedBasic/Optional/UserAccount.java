/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.javaAdvancedBasic.Optional;

import java.util.Optional;

/**
 *
 * @author Yassir Arafat
 */
public class UserAccount {
    
    private Long Id;
    
    private String userName = "yassir";
    
    private String firstName;
    
    private String lastName;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Optional doSomething(){
        System.out.println("Doing doing");
        return Optional.empty();
    }
}
