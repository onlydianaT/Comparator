import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Anya", "Orlova", 25));
        people.add(new Person("Kolya", "Popov-Martinov-Chekov", 35));
        people.add(new Person("Maksim", "Petrov", 75));
        people.add(new Person("Oleg", "Petrov-Ivanov", 45));
        people.add(new Person("Marat", "Petrov-Ivanov-Fpolom", 55));
        people.add(new Person("Konstantin", "Pet", 65));
        System.out.println(people);
        Collections.sort(people, new PersonsComparator(2));
        System.out.println(people);
    }

}
