package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

/**
 * User
 *
 * @author Andrii Zhytar
 */
@Component
@Data
public class User {

    private Long id;

    @Size(min = 2)
    private String name;

    @Email
    private String email;

    @JsonIgnore
    private String password;

    private AuthProvider provider;
}
