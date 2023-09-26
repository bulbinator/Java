import java.util.*;

public class App {
    public static void main(String[] args) {

        Person person1 = new Person(1, "Baker");
        Person person2 = new Person(2, "Coomer");
        Person person3 = new Person(3, "Susman");
        Person person4 = new Person(3, "Susman");


        Map<Person, Integer> map = new LinkedHashMap<>();

        map.put(person1, 1);
        map.put(person2, 2);
        map.put(person3, 3);
        map.put(person3, 4);

        for (Person i: map.keySet()) {
            System.out.println(i);
        }



        Set<Person> set = new LinkedHashSet<>();

        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person3);
    }
}
