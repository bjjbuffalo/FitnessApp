package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "progress")
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "exercise_name", nullable = false)
    private String exerciseName;

    @Column(nullable = false)
    private Integer weight;

    @Column(name = "number_of_reps", nullable = false)
    private Integer numberOfReps;

    // No-args constructor
    public Progress() {}

    // Parameterized constructor
    public Progress(User user, String exerciseName, Integer weight, Integer numberOfReps) {
        this.user = user;
        this.exerciseName = exerciseName;
        this.weight = weight;
        this.numberOfReps = numberOfReps;
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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getNumberOfReps() {
        return numberOfReps;
    }

    public void setNumberOfReps(Integer numberOfReps) {
        this.numberOfReps = numberOfReps;
    }}
