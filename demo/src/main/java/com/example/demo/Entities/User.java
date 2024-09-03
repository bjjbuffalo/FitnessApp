package com.example.demo.Entities;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;


    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;


    @Column(nullable = false)
    private Integer starting_lifting_weight ;

    //Set for one to many
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Goal> goals;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Progress> progressRecords;


    //no-args with JPA to create instances of entities
    public User() {}

    // Parameterized Constructor
    public User(String username, String name, Integer age, Integer startingLiftingWeight) {
        this.username = username;
        this.name = name;
        this.age = age;
        this.starting_lifting_weight = startingLiftingWeight;
    }



        //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



    public Integer getStartingLiftingWeight() {
        return starting_lifting_weight;
    }

    public void setStartingLiftingWeight(Integer startingLiftingWeight) {
        this.starting_lifting_weight = startingLiftingWeight;
    }

    public Set<Goal> getGoals() {
        return goals;
    }

    public void setGoals(Set<Goal> goals) {
        this.goals = goals;
    }

    public Set<Progress> getProgressRecords() {
        return progressRecords;
    }

    public void setProgressRecords(Set<Progress> progressRecords) {
        this.progressRecords = progressRecords;
    }


}
