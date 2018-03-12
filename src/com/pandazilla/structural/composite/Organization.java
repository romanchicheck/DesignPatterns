package com.pandazilla.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Organization {

    private List<Employee> employeeList = new ArrayList<>();

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    public void printEmployeeInfo() {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}
