package com.rb.auth.dto;

import lombok.Data;

@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
}
