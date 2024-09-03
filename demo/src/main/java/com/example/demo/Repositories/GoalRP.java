package com.example.demo.Repositories;

import com.example.demo.Entities.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoalRP extends JpaRepository<Goal, Long> {
}