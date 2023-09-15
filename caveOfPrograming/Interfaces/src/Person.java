public class Person implements Info{ // We use "implements" to implement the interface
    // Data
    private String name;

    // Methods
    public Person(String name) { // Constructor
        this.name = name;
    }
    public void greet(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + name);
    }
}
