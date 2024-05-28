package com.av.java8.stream;

import com.av.pojo.Employee;

import java.util.Comparator;
import java.util.List;

public class SortEmpBySalary {
    private static List<Employee> sortDescEmpBySalary(List<Employee> empList){
        return empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
    }
    private static List<Employee> sortAscEmpBySalary(List<Employee> empList){
        return empList.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
    }
    private static List<Employee> getTopThreeHighSalaryEmp(List<Employee> empList){
        return empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).toList();
    }
    private static List<Employee> getAllEmpWhoseSalaryLessThan3rdHightSalary(List<Employee> empList){
        return empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(3).toList();
    }
    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee("abc" , 1000.0),
                new Employee("xyz" , 2000.0),
                new Employee("mno" , 100.0),
                new Employee("xyz" , 300.0),
                new Employee("xyz" , 100000.0),
                new Employee("xyz" , 50.0)
        );
        System.out.println("DESC:"+sortDescEmpBySalary(list));
        System.out.println("ASE:"+sortAscEmpBySalary(list));
        System.out.println("Top 3 Emp:"+getTopThreeHighSalaryEmp(list));
        System.out.println("Less Than 3rd Height Emp:"+getAllEmpWhoseSalaryLessThan3rdHightSalary(list));
    }
}
