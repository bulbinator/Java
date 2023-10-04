import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();


        animals.add("coomer");
        animals.add("susman");
        animals.add("baker");

        for(String animal: animals) {
            System.out.println(animal);
        }
    }
}
