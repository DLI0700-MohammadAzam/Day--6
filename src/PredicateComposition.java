import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateComposition {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hello", "World", "Pandey", "Prabhas");
        Predicate<String> lenghtWith5 = c -> c.length() >= 5;
        Predicate<String> contains = c -> c.contains("e");

        names.stream()
                .filter(lenghtWith5.and(contains))
                .forEach(System.out::println);
    }
}
