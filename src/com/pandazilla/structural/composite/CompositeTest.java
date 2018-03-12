package com.pandazilla.structural.composite;

public class CompositeTest {

    public static void main(String[] args) {
        Organization organization = new Organization();
        Developer developer1 = new Developer();
        developer1.initEmployee(15000, "Nick Adams");
        Developer developer2 = new Developer();
        developer2.initEmployee(12000, "Bob Schultz");
        Designer designer1 = new Designer();
        designer1.initEmployee(10000, "Jeremy Jerome");
        Designer designer2 = new Designer();
        designer2.initEmployee(14000, "Jack Rid");
        organization.add(developer1);
        organization.add(developer2);
        organization.add(designer1);
        organization.add(designer2);
        organization.printEmployeeInfo();
        System.out.println("--------------------------------------------");
        organization.remove(developer2);
        organization.printEmployeeInfo();
    }
}
