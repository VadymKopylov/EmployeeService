package com.kopylov.employeeservice.factory;

import com.kopylov.employeeservice.employee.Employee;

import java.util.Random;

public class EmployeeFactory {

    public Employee[] getDefaultEmployee(){
        Employee firstEmployee = new Employee();
        firstEmployee.id = 1;
        firstEmployee.name = "Mark";
        firstEmployee.age = 25;
        firstEmployee.gender = 'm';
        firstEmployee.fixedBugs = 20;
        firstEmployee.defaultBugRate = 0.5;
        firstEmployee.salary = 3000 + firstEmployee.fixedBugs * 10/firstEmployee.defaultBugRate;

        Employee secondEmployee = new Employee();
        secondEmployee.id = 2;
        secondEmployee.name = "Eliz";
        secondEmployee.age = 30;
        secondEmployee.gender = 'f';
        secondEmployee.fixedBugs = 10;
        secondEmployee.defaultBugRate = 0.2;
        secondEmployee.salary = 3500 + secondEmployee.fixedBugs * 10/secondEmployee.defaultBugRate;

        Employee thirdEmployee = new Employee();
        thirdEmployee.id = 3;
        thirdEmployee.name = "Aleksei";
        thirdEmployee.age = 28;
        thirdEmployee.gender = 'm';
        thirdEmployee.fixedBugs = 18;
        thirdEmployee.defaultBugRate = 0.3;
        thirdEmployee.salary = 3200 + thirdEmployee.fixedBugs * 10/thirdEmployee.defaultBugRate;

        Employee fourthEmployee = new Employee();
        fourthEmployee.id = 4;
        fourthEmployee.name = "Aleksandr";
        fourthEmployee.age = 33;
        fourthEmployee.gender = 'm';
        fourthEmployee.fixedBugs = 5;
        fourthEmployee.defaultBugRate = 0.9;
        fourthEmployee.salary = 3400 + fourthEmployee.fixedBugs * 10/fourthEmployee.defaultBugRate;
        Employee[] defaultEmployees = {firstEmployee,secondEmployee,thirdEmployee,fourthEmployee};
        return defaultEmployees;
    }

    public Employee[] generateEmployees(int size){
        Random random = new Random();
        Employee[] employees = new Employee[size];
        String [] maleNames = {"Aleksandr","Maksim","Aleksei","Sergei"};
        String [] femaleNames = {"Natalia","Ksenia","Katerina","Olga"};
        char [] gender = {'m','f'};
        for(int i = 0;i < size;i++){
            Employee employee = new Employee();
            employee.id = (long) random.nextInt(100)+ 1;
            employee.age = 20 + random.nextInt(30);
            employee.gender = gender[random.nextInt(gender.length)];
            if (employee.gender == 'm'){
                employee.name = maleNames[random.nextInt(maleNames.length)];
            }else{
                employee.name = femaleNames[random.nextInt(femaleNames.length)];
            }
            employee.fixedBugs = random.nextInt(150);
            employee.defaultBugRate = 0.1+ random.nextDouble() * random.nextInt(10);
            employee.salary = 3000 + employee.fixedBugs * 10/employee.defaultBugRate;
            employees[i] = employee;
        }
        return employees;
    }
} 

