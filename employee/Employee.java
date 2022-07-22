package com.kopylov.employeeservice.employee;

public class Employee {
    public long id;
    public String name;
    public int age;
    public char gender;
    public double salary;
    public int fixedBugs;
    public double defaultBugRate;

    public Employee(){

    }

    public Employee(long id,String name,int age,double salary,int fixedBugs,double defaultBugRate){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
    }
    public void setName(String name){
        if(name.isEmpty()){
            System.out.println("Name is empty");
        }else {
            this.name = name;
        }
    }
    public void setAge(int age){
        if(age < 0){
            System.out.println("Age has been positive");
        }else {
            this.age = age;
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

