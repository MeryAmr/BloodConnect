package com.BloodConnect.BloodConnect.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Table(name = "blood_requests")
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
