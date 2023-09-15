class Robot {
    public void speak(String text) {
        System.out.println(text);
    }
}

public class parameters {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        robot1.speak("Umar was gay");
    }
}
