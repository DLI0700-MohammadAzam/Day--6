import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringList {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Azam","Maza","Sai","Akki","Amber","Prabhas","Arjun");

        List<String> filtered = names.stream()
                .filter(s -> s.startsWith("A") && s.length()>=4)
                .collect(Collectors.toList());

        System.out.println(filtered);
    }
}
