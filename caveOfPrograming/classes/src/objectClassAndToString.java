class Cow {

    private int id;
    private String name;

    // Constructor
    public Cow(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // custom toString method
    public String toString() {
        return id + ": " + name;
    }
}
public class objectClassAndToString {
    public static void main(String[] args) {
        // Every class in Java inherits from the default "Object" class
        Object obj = new Object();


        Cow cow1 = new Cow(7, "bob");
        System.out.println(cow1);

    }
}
