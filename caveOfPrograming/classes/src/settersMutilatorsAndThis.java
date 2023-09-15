class Pig {
    //data
    //encapsulation is hiding the instance data, idk why
    //private hides the data from outside classes, but you can use it in the class itself
    private String name;
    private int age;


    // methods & just stick that public keyword in there
    public void setName(String name) {
        this.name = name;
        // here "name" is refering to the variable passed into the method, and "this.name' is refering to the instance variable name.
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

public class settersMutilatorsAndThis {
    public static void main(String[] args) {
        Pig pig1 = new Pig();

        pig1.setName("umar");
        pig1.setAge(999);

    }
}
