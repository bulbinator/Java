public class Machine implements Info{ // We use "implements" to implement the interface
    // Data
    private int id = 7;

    // Methods
    public void start() {
        System.out.println("Machine started");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine ID is: " + id);
    }
}
