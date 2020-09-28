package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;



public class User
{
    private final String name;
    private final Long salary;



    public User(@JsonProperty("name") String name,
                @JsonProperty("salary") Long salary)
    {
        this.name = name;
        this.salary = salary;

    }


    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
    }
}
