package com.example.Task_manager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_task")
public class task {

    @Id
    private UUID id;

    private String itle;

    private String description;

    private LocalDate dueDate;

    private enum priority;

    private enum status;

    @Cr
    private LocalDateTime createdAt;




}
