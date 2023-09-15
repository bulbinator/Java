// How to find path of a file:
// Go to file properties
// Copy "Location" property
// Put it in a string

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Home\\Desktop\\example.txt";

        File textFile = new File(fileName); // Creating file object with our file path and storing it into a variable called "textFile"
        // Whenever you read a file, you have to throw this exception
        try {
            Scanner in = new Scanner(textFile);

            while (in.hasNext()) {
                String line = in.nextLine();
                System.out.println(line);
            }
            in.close(); // Be sure to close the test file
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
