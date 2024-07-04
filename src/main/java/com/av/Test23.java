package com.av;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test23 {

    private static void isArraySorted(List<Integer> intList){
        if(intList.size() == 0 || intList.size() == 1){
            System.out.println("its having one or zero element in list ");
            return;
        }
        boolean isSorted = false;
        if(intList.get(0) > intList.get(1)){
            isSorted = isAssending(intList);
        }else {
            isSorted = isDesending(intList);
        }
        if(isSorted){
            System.out.println("Element is ");
        }

    }
    private static boolean isDesending(List<Integer> intList){
        int diff = 0;
        boolean flag = false;

        for (int i = 1; i< intList.size() ; i++){

            if(intList.get(i) - intList.get( i - 1)  > 0){

            }else {
                return  false;
            }
        }
        return true;
    }
    private static boolean isAssending(List<Integer> intList){
        int diff = 0;
        boolean flag = false;

        for (int i = 1; i< intList.size() ; i++){

            if(intList.get(i) - intList.get( i - 1)  > 0){

            }else {
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        List<Employee> empList = List.of(
                new Employee("abhi", "Webapp",9045) ,
                new Employee("naaa", "Opera",150000),
                new Employee("kumar", "Opera",100000),
                new Employee("manu", "prod",50000)

        );

        Map<String, Long> empCount= empList.stream()
                .collect(
                        Collectors.groupingBy(Employee::getDepartment , Collectors.counting())
                )
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey ,
                        Map.Entry::getValue ,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new)

                );
        System.out.println(empCount);

//        List<Employee> empListWithSalkary = empList.stream().toList().stream().filter(e -> e.);
//                ;;
           List<Integer> intList= List.of(3,5,7,8,9,10);
       // System.out.println("Is this array is  sorted "+isArraySorted(intList));

    }

}
class Employee{
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}