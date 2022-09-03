import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Anya", "Orlova", 25));
        people.add(new Person("Kolya", "Popov-Martinov-Chekov-Bobop-Puutt", 35));
        people.add(new Person("Maksim", "Petrov", 75));
        people.add(new Person("Oleg", "Petrov-Ivanov", 45));
        people.add(new Person("Marat", "Petrov Ivanov Fpolom Trhfgd", 55));
        people.add(new Person("Konstantin", "Pet", 65));
        System.out.println(people);

        people.sort((o1,o2)->{
            String[] s;
            String[] s2;
            int numberOfSurname=2;
            s = o1.getSurname().split("\\w");
            s2 = o2.getSurname().split("\\w");
                if (s.length >= numberOfSurname && s2.length >= numberOfSurname) {
                    return Integer.compare(o2.getAge(), o1.getAge());
                }
            if (s.length < s2.length) {
                return 1;
            } else if (s.length > s2.length) {
                return -1;
            } else {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        });
        System.out.println(people);
    }

    }




