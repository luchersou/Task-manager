package com.example.Task_manager.repository;

import com.example.Task_manager.model.task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface taskEntity extends JpaRepository<task, UUID> {
}
