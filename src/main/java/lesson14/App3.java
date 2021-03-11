package lesson14;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(5);
        numbers.add(-4);
        System.out.println(numbers);
        numbers.set(1, 2);
        System.out.println(numbers);

        Person Sam = new Person("Sam", "Jakson");
        Person Mary = new Person("Mary", "Jane");
        List<Person> people = new ArrayList<>();
        people.add(Sam);
        people.add(Mary);
        people.add(new Person("Jack", "Bowee"));
        System.out.println(people);

    }
}
