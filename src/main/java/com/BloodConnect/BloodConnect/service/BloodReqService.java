package com.BloodConnect.BloodConnect.service;

import com.BloodConnect.BloodConnect.model.BloodRequest;
import com.BloodConnect.BloodConnect.repository.BloodReqRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodReqService {
    private final BloodReqRepository bloodReqRepository;

    public BloodReqService(BloodReqRepository bloodReqRepository) {
        this.bloodReqRepository = bloodReqRepository;
    }

    public List<BloodRequest> getAllRequests() {
        return bloodReqRepository.findAll();
    }

    public BloodRequest saveRequest(BloodRequest request) {
        return bloodReqRepository.save(request);
    }

    public List<BloodRequest> findRequestsByBloodType(String bloodType) {
        return bloodReqRepository.findByBloodType(bloodType);
    }
}