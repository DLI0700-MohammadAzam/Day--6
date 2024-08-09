
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapReduceOperation {
    public static void main(String[] args) {

        List<Integer> numbers =Arrays.asList(1,2,3,4,5);
       Integer even_squared = numbers.stream()
               .filter(c -> c%2 == 0)
               .map(c ->c*c)
               .reduce(0,(c1,c2) ->c1+c2);



       Integer odd_squared = numbers.stream()
               .filter(c->c%2!=0)
               .map(c ->c*c)
                       .reduce(0,(c1,c2) -> c1+c2);


        System.out.println("The sum of the odd squares "+odd_squared);
        System.out.println("The sum of the even squares "+even_squared);

    }
}
