package com.codewithshashi;

public class Employee {

    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name){
        System.out.println("Name :" +name);

    }

    public void empAge(int empAge) {
        this.age = empAge;
    }

    public void empDesignation(String empDes){
        this.designation = empDes;
    }

    public void empSalary(int empSalary) {
        this.salary = empSalary;
    }

    public void printEmployee(){
        System.out.println("Name:"+ name );
        System.out.println("Age:" + age );
        System.out.println("Designation:" + designation );
        System.out.println("Salary:" + salary);


    }

    public static void main(String[] args) {
        Employee empOne = new Employee("Sakshi Chaurasia");
        Employee empTwo = new Employee("Saksham Chaurasia");

        empOne.empAge(21);
        empOne.empSalary(5000);
        empOne.empDesignation("Student");
        empOne.printEmployee();

        empTwo.empAge(23);
        empTwo.empSalary(2500);
        empTwo.empDesignation("Human Resourses");
        empTwo.printEmployee();


    }


}
