package Person;

public class App {
    public static void main(String[] args) {
        PersonSimple p1 = new PersonSimple("Alex", "Schmidt", 10);

        Person p2 = new Person();
        p2.age = 10;
        p2.lastName = "Herbert";
        p2.name = "Mike";

        System.out.println("Person name is: "+ p2.name + ".  Last Name: "+p2.lastName+ ". Age is: " +p2.age);

        p1.printOnDisplay();

        PersonSimplest p3 = new PersonSimplest();
        p3.printPerson();


    }
}

