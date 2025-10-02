package com.av.ds.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
class Employee {

    String name;
    String dept;
    int salary;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<Employee> pq = new PriorityQueue<>(Comparator.comparing(e -> e.salary));
        pq.add(new Employee("Abhi", "A", 100));
        pq.add(new Employee("manu", "B", 10));
        pq.add(new Employee("kumar", "C", 1000));
        pq.add(new Employee("kiyan", "D", 10000));
        pq.add(new Employee("Kishan", "E", 1000000000));
        System.out.println(pq.peek());


    }
}
