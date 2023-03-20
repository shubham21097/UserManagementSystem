package com.microservice.usermanagement.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDao {
    private String response;
    private String state;
}
