package com.BloodConnect.BloodConnect.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String email;
    private String phoneNumber;
    private String bloodType;
    private String location;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<BloodRequest> bloodRequests;

}
