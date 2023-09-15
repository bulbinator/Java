public class stringBuilder {
    public static void main(String[] args) {

        // Inefficent
        String info = "";
        info += "My name is umar.";
        info += " I am gay";

        // Better
        StringBuilder sb = new StringBuilder(""); // Initialized
        sb.append("My name is umar.");
        sb.append(" I am gay");
        System.out.println(sb);

        // Formatting
        System.out.printf("Total cost %d\n", 25); // note the "printf".

    }
}
