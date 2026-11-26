//! Write a program to find the greatest of three numbers using if else statement.
// class demo {
//     public static void main(String[] args) {

//         int a = 20;
//         int b = 45;
//         int c = 30;

//         if (a > b && a > c) {
//             System.out.println(a + " is greater");
//         }
//         else if (b > a && b > c) {
//             System.out.println(b + " is greater");
//         }
//         else {
//             System.out.println(c + " is greater");
//         }
//     }
// }

//! Q2. Check whether a number is even or odd
// class demo{
//     public static void main(String[] args){
//        int num=60;
//         if(num%2==0){
//             System.out.println("It is even");
//         }
//         else{
//             System.out.println("it is odd");
//         }
//     }
// }

//! Reverse a number without converting it into a String.
// class demo{
//     public static void main(String[] args){
//         int num=12345;
//         int rev=0;
//         while(num!=0){
//             rev=rev*10+num%10;
//             num=num/10;
//         }
//         System.out.println("Reversed number is: "+rev);
//     }
// }
//! Q4. Check whether a number is palindrome or not
// class demo{
//     public static void main(String[] args){
//         int num=121;
//         int rev=0;
//         int temp=num;
//         while(num!=0){
//             rev=rev*10+num%10;
//             num=num/10;
//         }   
//         if(temp==rev){
//             System.out.println("It is a palindrome");
//         }
//         else{
//             System.out.println("It is not a palindrome");
//         }
//     }
// }
//! Q5. Find the Armstrong number of a number
// class demo{
//     public static void main(String[] args){
//         int num=153;
//         int sum=0;
//         int temp=num;
//         while(num!=0){
//             int digit=num%10;
//             sum=sum+digit*digit*digit;
//             num=num/10;
//         }
//         if(temp==sum){
//             System.out.println("It is an Armstrong number");
//         }
//         else{
//             System.out.println("It is not an Armstrong number");
//         }
//     }
// }

//! Write a program to check whether the number is good number or not
// class demo{
//     public static void main(String[] args){
//         int num=28;
//         int sum=0;
//         for(int i=1;i<num;i++){
//             if(num%i==0){
//                 sum=sum+i;
//             }
//         }
//         if(sum==num){
//             System.out.println("It is a good number");
//         }
//         else{
//             System.out.println("It is not a good number");
//         }
//     }
// }

//! Question 1: Employee Salary & Tax Calculation
//! Problem Statement
//! Design a payroll management module using dynamic polymorphism and contract-driven
//! abstraction:
//! 1. Create an interface Taxable with a method double calculateTax().
//! 2. Create an abstract class Employee with attributes id (int), name (String), and
//! baseSalary (double). Include a constructor, getters, and an abstract method
//! double calculateGrossSalary().
//! 3. Create subclass PermanentEmployee:
//! ○ Additional attribute: bonus (double).
//! ○ calculateGrossSalary() returns baseSalary + bonus.
//! ○ Implements Taxable: tax is 10% of gross salary.
//! 4. Create subclass ContractEmployee:
//! ○ Additional attributes: hourlyRate (double) and hoursWorked (int).
//! ○ calculateGrossSalary() returns baseSalary + (hourlyRate *
//! hoursWorked).
//! ○ Implements Taxable: tax is 5% of gross salary.
//! 5. Implement a driver class PayrollSystem that iterates over a list of Employee
//! objects and computes net salary (grossSalary - tax).


import java.util.ArrayList;
import java.util.List;

// 1. Interface
interface Taxable {
    double calculateTax();
}

// 2. Abstract class
abstract class Employee {

    private int id;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateGrossSalary();
}

// 3. Permanent Employee
class PermanentEmployee extends Employee implements Taxable {

    private double bonus;

    public PermanentEmployee(int id, String name,
                             double baseSalary, double bonus) {

        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateGrossSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public double calculateTax() {
        return calculateGrossSalary() * 0.10;
    }
}

// 4. Contract Employee
class ContractEmployee extends Employee implements Taxable {

    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(int id, String name,
                            double baseSalary,
                            double hourlyRate, int hoursWorked) {

        super(id, name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateGrossSalary() {
        return getBaseSalary() + (hourlyRate * hoursWorked);
    }

    @Override
    public double calculateTax() {
        return calculateGrossSalary() * 0.05;
    }
}

// 5. Main Payroll System
public class demo {

    public static void printPayroll(List<Employee> employees) {

        for (Employee emp : employees) {

            double gross = emp.calculateGrossSalary();

            double tax = 0.0;

            if (emp instanceof Taxable) {
                tax = ((Taxable) emp).calculateTax();
            }

            double netSalary = gross - tax;

            System.out.printf(
                "ID: %d | Name: %s | Gross: %.2f | Tax: %.2f | Net: %.2f%n",
                emp.getId(), emp.getName(), gross, tax, netSalary
            );
        }
    }

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new PermanentEmployee(101, "Alice", 50000, 10000));

        list.add(new ContractEmployee(102, "Bob", 20000, 150, 40));

        printPayroll(list);
    }
}

