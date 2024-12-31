package com.BloodConnect.BloodConnect.repository;

import com.BloodConnect.BloodConnect.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
