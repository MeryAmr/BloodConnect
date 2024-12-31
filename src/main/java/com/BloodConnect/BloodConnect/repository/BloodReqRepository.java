package com.BloodConnect.BloodConnect.repository;

import com.BloodConnect.BloodConnect.model.BloodRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BloodReqRepository extends JpaRepository<BloodRequest, Long> {
    List<BloodRequest> findByBloodType(String bloodType);
    List<BloodRequest> findByLocation(String location);
}
