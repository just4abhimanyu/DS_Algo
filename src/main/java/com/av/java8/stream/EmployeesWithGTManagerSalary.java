package com.av.java8.stream;

import com.av.pojo.Employee;
import com.av.pojo.Manager;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesWithGTManagerSalary {

    private static void getEmployeesGreaterThanManagerSalary(List<Manager> mgrList){
        List<Employee> employeesWithHigherSalary = mgrList.stream()
                .flatMap(mgr -> mgr.getEmployeeList().stream().filter(
                        emp -> emp.getSalary() > mgr.getSalary())).toList();

        employeesWithHigherSalary.forEach(System.out::println);
        //System.out.println("Manager List : "+employeesWithHigherSalary);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("abhi",100000.0);
        Employee emp2 = new Employee("manu",200000.0);
        Employee emp3 = new Employee("kumar",300000.0);
        Employee emp4 = new Employee("abhimanyu",400000.0);

        List<Employee> employeeList = List.of(emp1,emp2,emp3,emp4);

        Manager m1 = new Manager("sk",200000.0 ,employeeList);

        List<Manager> managerList = List.of(m1);
        getEmployeesGreaterThanManagerSalary(managerList);




    }
}
