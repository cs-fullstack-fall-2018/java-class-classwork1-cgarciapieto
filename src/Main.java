import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person personOne = new Person();
        personOne.setHeight(6);
        personOne.setWeight(150);

        Person personTwo = new Person();
        personTwo.setHeight(5);
        personTwo.setWeight(165);

        Person personThree = new Person();
        personThree.setHeight(4);
        personThree.setWeight(200);

        System.out.println(personOne.bodyMassIndex());
        System.out.println(personTwo.bodyMassIndex());
        System.out.print(personThree.bodyMassIndex());

        ArrayList<Person> groupArray = new ArrayList<Person>();
        groupArray.add(personOne);
        groupArray.add(personTwo);
        groupArray.add(personThree);

        personTwo.printPerson();


    }
}
