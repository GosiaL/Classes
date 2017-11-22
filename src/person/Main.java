package person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Gosia", "Nowa", 37, 'f'));
        personList.add(new Person("Luk", "Zen",41, 'm'));
        personList.add(new Person("Anna", "Kwiatek", 17, 'f'));

        for(Person person : personList){
            if(person.getAge() < 18){
                System.out.println( person.getName() + " " + person.getSurname() + " jest osobą niepełnoletnią.");
            }
        }
    }
}
