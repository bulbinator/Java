public class Plant {
    // Data
    public String name; // Bad practice to use, you want to hide/encapsualte them from the world

    public final static int ID = 8; // Its okay to make constant variables private

    // Methods
    public Plant() { // Constructor
        this.name = "Freddy";
    }
}
