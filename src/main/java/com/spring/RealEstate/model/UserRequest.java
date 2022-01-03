package com.spring.RealEstate.model;

import com.sun.istack.NotNull;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class UserRequest {

    @Id
    private int id;

    @NotBlank(message = "Username must not be empty")
    @NotNull
    @Column(nullable = false)
    private String username;

    @NotBlank(message = "Password must not be empty")
    @NotNull
    @Column(nullable = false)
    private String password;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public UserRequest(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }
    public UserRequest() {

    }
	
}
