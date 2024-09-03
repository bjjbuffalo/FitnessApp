package com.example.demo.Service;

import com.example.demo.Entities.Exercise;
import com.example.demo.Repositories.ExerciseRP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ExerciseService {

    @Autowired
    private ExerciseRP exerciseRepository;

    // Method to get exercises by day of the week
    public List<Exercise> getExercisesByDayOfWeek(String dayOfWeek) {
        return exerciseRepository.findByDayOfWeek(dayOfWeek);
    }
}
