import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> laen = new ArrayList<String>();
        laen.add("baker");
        laen.add("commer");
        laen.add("susman");

        // Two ways of iterating through a list:

        for (int i=0; i < laen.size(); i++) {
            System.out.println(laen.get(i));
        }

        for (String i: laen) {
            System.out.println(i);
        }
    }
}
