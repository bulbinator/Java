import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("coomer");
        list.add("susman");
        list.add("baker");
        showList(list);

        // You can also make an array list of your own objects:

        ArrayList<Machine> machines = new ArrayList<Machine>();
        machines.add(new Machine());
        machines.add(new Machine());
        showMachines(machines);

    }

    public static void showList(ArrayList<String> list) {
        for(String items: list) {   // This loops through each item in the list and saves it as "item".
            System.out.println(items);
        }
    }

    public static void showMachines(ArrayList<Machine> machines) {
        for (Machine machine: machines) {
            System.out.println(machine);
        }
    }

    // This is where wildcards come from
    public static void showWildcard(ArrayList<?> list) { // <?> means wildcard
        for(Object items: list) {   // This loops through each item in the list and saves it as "item".
            System.out.println(items);
        }
    }
}
