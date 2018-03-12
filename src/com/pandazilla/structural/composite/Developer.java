package com.pandazilla.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Developer implements Employee{

    private double salary;
    private String name;
    private List<String> roles = new ArrayList<>();

    @Override
    public void initEmployee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public List<String> getRoles() {
        roles.add("Write code");
        roles.add("Bug fixing");
        return roles;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
