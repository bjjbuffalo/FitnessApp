package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "goals")
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "exercise_name", nullable = false)
    private String exerciseName;

    @Column(name = "goal_max_weight", nullable = false)
    private Integer goalMaxWeight;

    // No-args constructor
    public Goal() {}

    // Parameterized constructor
    public Goal(User user, String exerciseName, Integer goalMaxWeight) {
        this.user = user;
        this.exerciseName = exerciseName;
        this.goalMaxWeight = goalMaxWeight;
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

    public Integer getGoalMaxWeight() {
        return goalMaxWeight;
    }

    public void setGoalMaxWeight(Integer goalMaxWeight) {
        this.goalMaxWeight = goalMaxWeight;
    }}
