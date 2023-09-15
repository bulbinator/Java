class Thing {
    // here we are using public variables (idk) with the keyword static:

    public String name;

    //static essentially means that the each object of the class does not get its own copy of that variable.
    //so therefore it belongs only to the class, so instead of calling it as thing1.description = "xyz"
    //We would call it by its class: Thing.description = "xyz"
    //instance variable means that every instance of a class gets their own copy
    //static variables aka class variables belong to the class
    //final just means constant
    public static String description;

    //static variables are good of this such as counting how many instances there are of a class:
    public static int count = 0;

    public Thing() {
        count++;
    }

    //static vs instance methods:

    public String getName() {
        return this.name;
    }
    public static String getDescription() {
        return description;
    }
}

public class staticAndFinal {
    public static void main(String[] args) {
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        Thing.description = "umar was gay";

        thing1.name = "umar";
        thing2.name = "susman";

        System.out.println(Thing.getDescription());
        System.out.println(Thing.count);
    }
}
