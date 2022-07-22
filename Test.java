package com.kopylov.employeeservice;

import com.kopylov.employeeservice.employee.Employee;
import com.kopylov.employeeservice.factory.EmployeeFactory;
import com.kopylov.employeeservice.service.EmployeeService;

public class Test {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee[] defaultEmployees = employeeFactory.generateEmployees(10);
        EmployeeService employeeService = new EmployeeService(defaultEmployees);
        Employee[] sortByName = employeeService.sortByNameAndSalary();
        for(Employee employee: sortByName){
            printEmloyees(employee);
        }

        double salary = employeeService.calculateSalaryAndBonus(defaultEmployees);
        System.out.println(salary);
    }
    public static void printEmloyees(Employee employee){
        System.out.println("This is a com.kopylov.employeeservice.employee.Employee with ");
        System.out.println(" id- " + employee.id);
        System.out.println(" name- " + employee.name);
        System.out.println(" age- " + employee.age);
        System.out.println(" salary- " + employee.salary);
        System.out.println(" fixedBugs- " + employee.fixedBugs);
        System.out.println(" defaultBugRate- " + employee.defaultBugRate);
        System.out.println("--------");
        System.out.println("--------");
    }
}

