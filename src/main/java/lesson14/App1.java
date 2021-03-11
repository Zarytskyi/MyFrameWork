package lesson14;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public App1() {
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Colour");
        list.add("Pencil");
        list.add("Cow");
        System.out.println(list);
        list.add("Car");
        System.out.println(list.get(1));
        list.set(2, "Sheep");
        // .add(value) > add value to List
        // .get(valute) > returns value from List
        // .set(value) > replace a value
        // .set(int) > replace one int with another. *for int only*
        // .size > show a lenght of a list
        // .remove > removes only first value from a list
        // .contains > verify if value is in a list. *must be boolean*
        list.add(1,"New");
        System.out.println(list);
        System.out.println(list.get(list.size()-1)); // return last value of a list
        list.add("Pencil");
        System.out.println(list);
        list.remove("Pencil");
        String xx = list.remove(1);
        System.out.println(xx);
        System.out.println(list);

        boolean vv = list.contains("Car");
        System.out.println(vv);

        for (String ss: list){
//            System.out.println(ss);
        }

        list.forEach(System.out::println);




    }
}