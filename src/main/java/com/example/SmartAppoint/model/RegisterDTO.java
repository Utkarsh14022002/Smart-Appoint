package com.example.SmartAppoint.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "register")
public class RegisterDTO {
    @Id
    private String email;
    private String userId;
    private String password;
}
