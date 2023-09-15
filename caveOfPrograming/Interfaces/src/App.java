public class App {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Umar");
        person1.greet();

        mach1.showInfo();
        person1.showInfo();
    }
}
