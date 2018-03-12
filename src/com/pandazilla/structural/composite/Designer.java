package com.pandazilla.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Designer implements Employee {

    private double salary;
    private String name;
    private  List<String> roles = new ArrayList<>();

    @Override
    public void initEmployee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public List<String> getRoles() {
        roles.add("Design UX");
        roles.add("Design UI");
        return roles;
    }

    @Override
    public String toString() {
        return "Designer{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
