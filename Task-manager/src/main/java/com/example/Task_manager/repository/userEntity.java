package com.example.Task_manager.repository;

import com.example.Task_manager.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface userEntity extends JpaRepository<user, UUID> {
}
