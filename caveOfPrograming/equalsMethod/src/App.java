public class App {
    // "==" will only check if two variables are pointing to the same object
    public static void main(String[] args) {
        Person person1 = new Person(2, "coomer");
        Person person2 = new Person(2, "coomer");

        System.out.println(person1 == person2); // This will throw false because they are still different objects pointing at different locations in memory

        System.out.println(person1.equals(person2)); // In order to compare two objects, the objects must have thier own ".equals()" method defined in thier class, which can be done with the "Generate" option.

        String string1 = "umar";
        String string2 = "umar";

        System.out.println(string1.equals(string2));
    }
}
