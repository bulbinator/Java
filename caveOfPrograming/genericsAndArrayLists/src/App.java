import java.util.ArrayList; // ArrayLists make lists easy to use

public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // Here we put <String> in dimond brackets to specify what kind of list we want
        list.add("coomer");
        list.add("baker");
        list.add("susman");

        String animal = list.get(2);
        System.out.println(animal);
    }
}
