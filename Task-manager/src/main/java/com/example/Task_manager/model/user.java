package com.example.Task_manager.model;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_user")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    private String username;

    private String email;

    private String password;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    private String User;
}
