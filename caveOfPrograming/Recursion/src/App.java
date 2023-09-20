// Recursion is basically a function calling itself.

public class App {
    public static void main(String[] args) {
        calculate(4);

        // Factorials are numbers times the numbers below it, ex: 4!. ---> 4*3*2*1

        System.out.println(factorial(4));
    }

    private static void calculate(int value) {
        //calculate(value);  results in a StackOverflow error.
        // The stack remembers functions, variables, and local variables.
        // The heap remembers created objects, i.e when the "new" keyword is used.

        if (value == 1) {
            return;
        }
        calculate(value - 1);
    }

    private static int factorial(int value) {
        if (value == 1) {
            return 1;
        }
        return factorial(value - 1) * value;
    }
}
