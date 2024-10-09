package Task1;

public class Employee {
    private String Name;
    private String lastName;
    private int age;
    private int employeesNumber;
    private String email;


    public Employee(String Name, String lastName, int age, int employeesNumber) {
        this.Name = Name;
        this.lastName = lastName;
        this.age = age;
        this.employeesNumber = employeesNumber;
        this.email = generateEmail(Name, lastName);
    }


    private String generateEmail(String Name, String lastName) {
        return Name.toLowerCase() + "." + lastName.toLowerCase() + "@mentormakers.com";
    }


    public void printEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("First Name: " + Name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Employee Number: " + employeesNumber);
        System.out.println("Email: " + email);
    }
}
