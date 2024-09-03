package com.example.demo.Repositories;

import com.example.demo.Entities.Progress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgressRP extends JpaRepository<Progress, Long> {
    // Find progress by user and exercise name
    List<Progress> findByUser_IdAndExerciseName(Long userId, String exerciseName);
}