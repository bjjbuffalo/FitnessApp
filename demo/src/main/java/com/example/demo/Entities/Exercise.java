package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "exercises")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "exercise_name", nullable = false)
    private String exerciseName;

    @Column(nullable = false)
    private Integer reps;

    @Column(name = "description")
    private String description;

    @Column(name = "number_of_sets")
    private Integer numberOfSets;

    @Column(name = "day_of_week")
    private String dayOfWeek;

    // No-args constructor
    public Exercise() {}

    // Parameterized constructor
    public Exercise(User user, String exerciseName, Integer reps, String description, Integer numberOfSets, String dayOfWeek) {
        this.user = user;
        this.exerciseName = exerciseName;
        this.reps = reps;
        this.description = description;
        this.numberOfSets = numberOfSets;
        this.dayOfWeek = dayOfWeek;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public Integer getReps() {
        return reps;
    }

    public void setReps(Integer reps) {
        this.reps = reps;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumberOfSets() {
        return numberOfSets;
    }

    public void setNumberOfSets(Integer numberOfSets) {
        this.numberOfSets = numberOfSets;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}