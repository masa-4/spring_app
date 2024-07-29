package com.example.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.webapp.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}
