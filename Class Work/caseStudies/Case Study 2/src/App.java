import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of the loan: ");
        double loan = scanner.nextDouble();

        System.out.println("Enter the interest rate of the loan: ");
        double rate = scanner.nextDouble();

        System.out.println("Enter the number of years in the loan: ");
        int years = scanner.nextInt();

        Amortization amortization = new Amortization(loan, rate, years);
        try {
            amortization.saveReport("Report");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
