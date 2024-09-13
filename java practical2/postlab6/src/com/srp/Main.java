package com.srp;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", "Manager");
        Employee emp2 = new Employee("Bob", "Developer");

        SalaryCalculator calculator = new SalaryCalculator();
        System.out.println("Salary of " + emp1.getName() + ": $" + calculator.calculateSalary(emp1));
        System.out.println("Salary of " + emp2.getName() + ": $" + calculator.calculateSalary(emp2));
    }
}
