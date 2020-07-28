package ru.GeekBrains.lesson5;

public class Employee {
    public String fullName;
    public String workingPosition;
    public String email;
    public long phoneNumber;
    public long salary;
    public int age;

    public Employee(String fullName, String workingPosition, String email, long phoneNumber, long salary, int age) {
        this.fullName = fullName;
        this.workingPosition = workingPosition;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void allAboutEmployees() {
        System.out.println("Full name: " + fullName);
        System.out.println("Working position: " + workingPosition);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

}
