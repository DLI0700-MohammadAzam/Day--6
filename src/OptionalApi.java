import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalApi {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList();

        Optional<Integer> max = list.stream().max((c1, c2) -> c1.compareTo(c2));
        max.ifPresentOrElse(t-> System.out.println(t),() -> System.out.println("Null"));
    }


}
