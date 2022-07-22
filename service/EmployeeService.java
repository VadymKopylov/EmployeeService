package com.kopylov.employeeservice.service;

import com.kopylov.employeeservice.employee.Employee;

import java.util.Arrays;

public class EmployeeService {
    public Employee[] employees;
    public Employee employee;

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }
    EmployeeService(Employee employee){
        this.employee = employee;
    }

     public double calculateSalaryAndBonus(Employee[] employees) {
         double sum = 0;
         for (Employee employee : employees) {
            sum = sum + employee.salary;
        }
        return sum;
    }

    public Employee getById (long id){
        for(int i = 1;i < employees.length;i++){
            Employee employee = employees[i];
            if(employee.id == id){
                return employee;
            }
        }
        return null;
    }

    public Employee[] getByName(String name){
        Employee [] newEmployeeArray = new Employee[employees.length];
        int count = 0;
        for(int i = 0;i < employees.length;i++){
                if(employees[i].name.equals(name)){
                    newEmployeeArray[i] = employees[i];
                    count++;
                }
        }
        if(count == 0){
            return null;
        }
        Employee [] getByName = new Employee[count];
            for(int i = 0;i < getByName.length;i++){
                Employee employee = newEmployeeArray[i];
                getByName[i] = employee;
            }
        return getByName;
    }

    public Employee removeById(long id){
        int indexToRemove = -1;
            for(int i = 0;i < employees.length;i++){
                Employee employee = employees[i];
                if(employee.id == id){
                    indexToRemove = i;
                    break;
                }
            }
            if(indexToRemove == -1){
                return null;
            }
            Employee [] newEmployeesArray = new Employee[employees.length - 1];
                int counter = 0;
                for(int i = 0;i < employees.length;i++){
                    if(i != indexToRemove) {
                        newEmployeesArray[counter] = employees[i];
                        counter++;
                    }
                }
                Employee removeEmployee = employees[indexToRemove];
                employees = newEmployeesArray;
                return removeEmployee;

    }

     public Employee[] sortByName(){
            Employee[] sortByName = Arrays.copyOf(employees,employees.length );
                for(int i = 0;i < sortByName.length;i++){
                    for(int  j = i + 1;j < sortByName.length ;j++){
                        if(sortByName[i].name.charAt(0) > sortByName[j].name.charAt(0)){
                            Employee value = sortByName[i];
                            sortByName[i] = sortByName[j];
                            sortByName[j] = value;
                        }
                    }
                }
            return sortByName;
    }

    public Employee[] sortByNameAndSalary(){
        Employee[] sortByName = sortByName();
        for(int i = 0;i < sortByName.length;i++){
            for(int  j = i + 1;j < sortByName.length;j++){
                if(sortByName[i].name.equals(sortByName[j].name)){
                    if(sortByName[i].salary < sortByName[j].salary){
                        Employee value = sortByName[i];
                        sortByName[i] = sortByName[j];
                        sortByName[j] = value;
                    }
                }
            }
        }
        return sortByName;
    }

    public Employee edit(Employee newEmployee){
        if(newEmployee.id > employees.length){
            return null;
        }
        Employee returnEmployee = getById(newEmployee.id);
        Employee createdEmployee = new Employee(newEmployee.id,newEmployee.name,newEmployee.age,
                                        newEmployee.salary,newEmployee.fixedBugs,newEmployee.defaultBugRate);
        employees[(int)newEmployee.id -1] = createdEmployee;
        return returnEmployee;
    }
}


