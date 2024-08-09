import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


class PersonDemo {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PersonDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PersonDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}
public class ConsumerInterface {
    static void sum(List<Integer> s)
    {
        int result =s.stream()
                .mapToInt(Integer::intValue).sum(); // [10,30,...]
        System.out.println(result);
    }
    static void upper(List<PersonDemo> s)
    {
        s.stream().map(c ->
        {
            c.setName(c.getName().toUpperCase());
            return c;
        }).forEach(System.out::println);
    }
    public static void main(String[] args) {


        PersonDemo p1 = new PersonDemo("azam", 12);
        PersonDemo p2 = new PersonDemo("azam1", 2);
        PersonDemo p3 = new PersonDemo("azam3", -1);
        PersonDemo p4 = new PersonDemo("azam4", 40);
        PersonDemo p5 = new PersonDemo("azam5", 20);

        List<PersonDemo> personList = Arrays.asList(p1,p2,p3,p4,p5);


        int age = personList.stream().mapToInt(PersonDemo::getAge).sum();
        System.out.println("Age sum "+age);
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Consumer<List<Integer>> string = ConsumerInterface::sum;
        string.accept(numbers);
        Consumer<List<PersonDemo>> upperName = ConsumerInterface::upper;
        upperName.accept(personList);

    }
}
