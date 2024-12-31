package com.BloodConnect.BloodConnect.controller;

import com.BloodConnect.BloodConnect.model.BloodRequest;
import com.BloodConnect.BloodConnect.service.BloodReqService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requests")
public class BloodReqController {
    private final BloodReqService bloodReqService;

    public BloodReqController(BloodReqService bloodReqService) {
        this.bloodReqService = bloodReqService;
    }

    @GetMapping
    public List<BloodRequest> getAllRequests() {
        return bloodReqService.getAllRequests();
    }

    @PostMapping
    public BloodRequest createRequest(@RequestBody BloodRequest request) {
        return bloodReqService.saveRequest(request);
    }

    @GetMapping("/by-blood-type")
    public List<BloodRequest> getRequestsByBloodType(@RequestParam String bloodType) {
        return bloodReqService.findRequestsByBloodType(bloodType);
    }
}