class Human {
    String name;
    int age;

    void speak() {
        System.out.println("Hello");
    }

    //Heres a method with a return:

    int calculateYearsToRetirement () {
        int yearsLeft = 65 - age;
        return yearsLeft;
    }
}



public class returnMethods {
    public static void main(String[] args) {
        Human person1 = new Human();
        person1.age = 25;
        person1.name = "coomer";
        System.out.println(person1.calculateYearsToRetirement());
    }
}
