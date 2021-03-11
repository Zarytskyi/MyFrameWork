package Person;

public class PersonSimple {
    String name;
    String lastName;
    int age;

    public PersonSimple (String personName, String personLastName, int personAge){
        name = personName;
        lastName = personLastName;
        age = personAge;
    }



    public void printOnDisplay(){
        System.out.println("Person name is: "+ name + ".  Last Name: "+lastName+ ". Age is: " +age);
    }
}
