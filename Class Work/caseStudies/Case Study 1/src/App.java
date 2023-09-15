import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Get Sales
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of monthly sales:");
        double sales = scanner.nextDouble();

        // Get advanced pay
        System.out.println("Enter the amount of advanced pay:");
        double advance = scanner.nextDouble();

        // Calculate Rate
        double rate;

        if (sales < 10000) {
            rate = 0.05;
        }

        else if (sales < 15000) {
            rate = 0.1;
        }

        else if (sales < 18000) {
            rate = 0.12;
        }

        else if (sales < 22000) {
            rate = 0.15;
        }

        else {
            rate = 0.16;
        }

        // Calculate Commission
        double commission;
        double pay;

        commission = sales * rate;
        pay = commission - advance;
        System.out.println(pay);

    }
}
