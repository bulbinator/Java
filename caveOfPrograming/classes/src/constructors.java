// constructors run every time an instance of your class is actualized
class Machine {
    //data/instance vartibeles
    private String name;

    // methods
    // constructors must match the name of the class, and they have no return type
    public Machine() {
        System.out.println("Construtor running");
        //this will print even though you never called it, so it runs evey time an instance is created

        this.name = "cybertron";
        //this sets a default value for name
    }

    //you can also overload constuctors, i.e same name but different return types:

    public Machine(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}


public class constructors {
    public static void main(String[] args) {
        //think of "new Machince()" as a call to the constructor essentially
        Machine machine1 = new Machine();

        //here we call the constructor with a custom name setting:
        Machine machine2 = new Machine("umar");
        System.out.println(machine2.getName());

    }
}
