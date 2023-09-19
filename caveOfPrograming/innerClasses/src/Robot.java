public class Robot {
    // data
    private int id;

    // Inner Classes are classes created within a class, there are two types: static and non-static:

    // Non-static
    class Brain {
        public void think() {
            System.out.println("Robot " + id + " is thinking.");
        }
    }

    // Static class
    static class Battery {
        public void charge(){
            System.out.println("Battery is charging...");
        }
    }





    // Methods
    public Robot(int id) {
        this.id = id;
    }

    public void start(){
        System.out.println("Starting robot.");
        Brain brain = new Brain();
        brain.think(); // we call the inner class in this method
    }
}
