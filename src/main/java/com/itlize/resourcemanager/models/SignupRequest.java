package com.itlize.resourcemanager.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequest {
    private String username;
    private String password;
    private String confirmPassword;
    private String email;
    private String first_name;
    private String last_name;
//    private String roles;
}
