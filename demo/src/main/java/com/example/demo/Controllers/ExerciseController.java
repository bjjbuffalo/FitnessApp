package com.example.demo.Controllers;

import com.example.demo.Entities.Exercise;
import com.example.demo.Service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    // Endpoint to get exercises by day of the week
    @GetMapping("/by-day/{dayOfWeek}")
    public List<Exercise> getExercisesByDayOfWeek(@PathVariable String dayOfWeek) {
        return exerciseService.getExercisesByDayOfWeek(dayOfWeek);
    }
}
//http://localhost:8080/api/exercises/by-day/Monday