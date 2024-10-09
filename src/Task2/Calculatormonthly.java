package Task2;

public class Calculatormonthly {
    private double totalLeasedMoney;
    private double downPayment;
    private int monthsLeaseTerm;
    private double interestRate;

    // Constructor
    public Calculatormonthly(double totalLeasedMoney, double downPayment, int monthsLeaseTerm, double interestRate) {
        this.totalLeasedMoney = totalLeasedMoney;
        this.downPayment = downPayment;
        this.monthsLeaseTerm = monthsLeaseTerm;
        this.interestRate = interestRate;
    }

    public double calculatemonthlyamount() {
        return ((totalLeasedMoney - downPayment) +
                ((totalLeasedMoney - downPayment) * (interestRate / 100))) / monthsLeaseTerm;
    }
}
