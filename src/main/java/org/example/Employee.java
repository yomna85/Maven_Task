package org.example;

import java.io.Serializable;

public class Employee implements Serializable {
    String name="Ahmed Mohamed Ali";
    int id=2;
    int age=24;
    String position="Data Engineer";
    int salary=10000;



    public Employee(String name,int id,int age, String position,int salary){
        this.name=name;
        this.id=id;
        this.age=age;
        this.position=position;
        this.salary=salary;

    }

    public void print_Employee(){
        System.out.println("Employee Name:"+ name);
        System.out.println("Id: "+ id);
        System.out.println("Age :"+ age);
        System.out.println("Position:"+ position);
        System.out.println("Salary:"+ salary);


    }

    public Object getName() {
        return this.name;
    }
    public void setName(String name) {
         this.name=name;
    }
    public Object getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public Object getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public Object getPosition() {
        return this.position;
    }
    public void setPosition(String position) {
        this.position=position;
    }
    public Object getSalary() {
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary=salary;
    }
}

