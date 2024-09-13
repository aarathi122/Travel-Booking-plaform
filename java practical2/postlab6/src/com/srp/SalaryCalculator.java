package com.srp;

public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        double baseSalary = 3000; // Base salary for simplicity
        switch (employee.getRole()) {
            case "Manager":
                return baseSalary + 2000;
            case "Developer":
                return baseSalary + 1000;
            case "Intern":
                return baseSalary;
            default:
                return baseSalary;
        }
    }
}
