package com.microservice.usermanagement.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="USERS")
public class User {
    @Id
    private String id;
    private String fullName;
    private String email;
    private String password;
    private String role;
}
