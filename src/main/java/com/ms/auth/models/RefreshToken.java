package com.ms.auth.models;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "refresh_token")
public class RefreshToken {
    @Id
    private String id;

    @DBRef
    private User user;

    @NotBlank
    private String token;

    @NotBlank
    private Instant expiryDate;
}