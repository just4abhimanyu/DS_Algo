package com.av.pojo;

import java.util.List;

public class Manager {
    private String name;
    private Double salary;
    private List<Employee> employeeList;

    public Manager(String name, Double salary, List<Employee> employeeList) {
        this.name = name;
        this.salary = salary;
        this.employeeList = employeeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
