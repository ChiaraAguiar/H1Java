package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter a total rental month: ");
        double totalLeasedMoney = scanner.nextDouble();

        System.out.print("please enter the initial pay: ");
        double downPayment = scanner.nextDouble();

        System.out.print("please enter de month term: ");
        int monthsLeaseTerm = scanner.nextInt();

        System.out.print("please enter the interest: ");
        double interestRate = scanner.nextDouble();


        Calculatormonthly calculator = new Calculatormonthly(totalLeasedMoney, downPayment, monthsLeaseTerm, interestRate);


        double monthlyPayment = calculator.calculatemonthlyamount();


        System.out.printf(" the monthly payment amount is: %.2f%n", monthlyPayment);


        scanner.close();
    }
}
