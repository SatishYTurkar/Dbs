package com.ibm.Dbs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
public class HistoricalEvent {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String eventName;
    private LocalDateTime eventDate;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    // getters and setters
}