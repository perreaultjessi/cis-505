/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment8;

public class FinanceCalculator
{
    private static final int MONTHS_IN_YEAR = 12;

    public static double calculateFutureValue(double monthlyPayment, double rate, int years) {
        int months = years * MONTHS_IN_YEAR;
        double interestRate = 1 + rate / 100;
        double presentValue = monthlyPayment * months;
        double futureValue = presentValue * Math.pow(interestRate, months);
        return futureValue;
    }

    public static void main(String[] args) {
        double monthlyPayment = 1000;
        double rate = 5;
        int years = 5;

        double futureValue = calculateFutureValue(monthlyPayment, rate, years);
        System.out.println("Future Value: " + futureValue);
    }
}
