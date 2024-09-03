package com.example.demo.Repositories;

import com.example.demo.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRP extends JpaRepository<User, Long> {
    // Custom query methods
}