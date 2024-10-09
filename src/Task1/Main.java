package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Name");
        String Name = scanner.nextLine();


        System.out.print("Please enter your last name");
        String lastName = scanner.nextLine();

        int age = -1;
        while (age < 0 || age > 100) {
            System.out.print("Enter age (0-100): ");
            age = scanner.nextInt();
            if (age < 0 || age > 100) {
                System.out.println("Invalid age. Please enter a value between 0 and 100.");
            }
        }

        int employeesNumber = -1;
        while (employeesNumber < 27560000 || employeesNumber > 27569999) {
            System.out.print("Enter employee number (27560000-27569999): ");
            employeesNumber = scanner.nextInt();
            if (employeesNumber < 27560000 || employeesNumber > 27569999) {
                System.out.println("Invalid employee number. Please enter a value between 27560000 and 27569999.");
            }
        }


        Employee employee = new Employee(Name, lastName, age, employeesNumber);


        employee.printEmployeeDetails();
    }
}
