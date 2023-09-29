import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Amortization {
    // data
    private double loanAmount;
    private double interestRate;
    private double loanBalance;
    private double term;
    private double payment;
    private int loanYears;

    // methods
    public Amortization(double loan, double rate, int years) {
        this.loanAmount = loan;
        this.interestRate = rate;
        this.loanYears = years;
        calcPayment();
    }

    private void calcPayment(){
        double term = Math.pow((1+interestRate/12.0), 12.0 * loanYears);
        this.payment = (loanAmount * interestRate/12.0 * term) / (term - 1);
    }

    public int getNumberOfPayments() {
        return 12 * loanYears;
    }

    public void saveReport(String filename) throws IOException {
        double monthlyInterest;
        double principal;

        FileWriter fw = new FileWriter(filename);
        PrintWriter output = new PrintWriter(fw);

        output.println(String.format("Monthly Payment: $%.2f", payment));
        output.println("Month\tInterest\tPrincipal\tBalanace");
        output.println();

        for (int month = 1; month <= getNumberOfPayments(); month++) {
            monthlyInterest = interestRate / 12.0 * loanBalance;

            if (month != getNumberOfPayments()){
                principal = payment - monthlyInterest;
            }
            else {
                principal = loanAmount;
                payment = loanBalance + monthlyInterest;
            }

            loanBalance -= principal;
            output.println(String.format("%d\t%.2f\t\t%.2f\t\t%.2f", month, ,monthlyInterest, principal, loanBalance));
        }

        output.close();
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public int getLoanYears(){
        return loanYears;
    }

}
