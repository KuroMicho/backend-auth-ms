package com.ms.auth.models;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document(collection = "users")
public class User {

    @Id
    private String id;

    @NotBlank
    @Size(max = 20)
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email(message = "Formato de Email incorrecto!")
    private String email;

    @NotBlank
    private String password;

    @DBRef
    private Set<Role> roles = new HashSet<>();

    public User(String username,
            String email,
            String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
