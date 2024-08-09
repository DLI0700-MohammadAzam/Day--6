import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortingListOfObjects {
    public static void main(String[] args) {


        Person p1 = new Person("Azam", 26, 25f);
        Person p2 = new Person("Sai", 21, 25f);
        Person p3 = new Person("Bhai", 25, 45f);
        List<Person> people = Arrays.asList(p1, p2, p3);
        List<Person> sortedList = people.stream()

                .sorted((c1, c2) -> c1.age - c2.age)

                .filter((c1) ->c1.salary >30f)

                .map(c1 -> {
//                    Scanner input = new Scanner(System.in);
//                    System.out.println("Enter name");
//                    String name_to_change = input.nextLine();
                    System.out.println(c1.name);
                    c1.setName(c1.getName().toUpperCase());
                    return c1;
                })

                .collect(Collectors.toList());


        System.out.println(sortedList);
//        System.out.println(people);

    }
}
