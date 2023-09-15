public class App {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        // Upcasting
        Machine machine2 = camera1; // This works because they inherit from eachother
        machine2.start(); // This will call the camera object

        // machine2.snap(); This wont work, because the type of the variable is machine

        // Downcasting
        Machine machine3 = new Camera();
        Camera camera2 = (Camera) machine3; // Here Java wants confirmation on what you are doing, so you have to place "(Camera)" before hand
    }
}
