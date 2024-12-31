package com.BloodConnect.BloodConnect.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
public class BloodRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    private String bloodType;
    private String urgency;
    private String location;
    private String status;
    private LocalDate requestedDate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
