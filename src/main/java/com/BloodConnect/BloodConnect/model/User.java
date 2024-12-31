package com.BloodConnect.BloodConnect.model;

import jakarta.persistence.*;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "users")
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
