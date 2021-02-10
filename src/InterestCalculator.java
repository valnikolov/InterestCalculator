import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = scanner.nextDouble();
        double annualInterestRate = scanner.nextDouble();

        double monthlyInterest = balance * annualInterestRate / 1200;

        System.out.printf("Monthly interest: %.2f%n", monthlyInterest);


    }

}
