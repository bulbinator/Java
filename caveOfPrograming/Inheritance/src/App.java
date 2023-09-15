// classes should be created in seperate files, refer to Machine.java

public class App {
    public static void main(String[] args) {
        Machine machine1 = new Machine();

        machine1.start();
        machine1.stop();

        // Since class car inherits/extends from class Machine, it now gains the **public** methods and data belonging to class Machine
        Car car1 = new Car();
        car1.start();
        car1.wipeWindShield();
        car1.stop();
    }
}
