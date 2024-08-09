import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterPoliciesByPremiumAmount {
    public static void main(String[] args) {
        Policy p1 = new Policy("1435","Sai Prabhas",1199.56);

        Policy p2 = new Policy("1436","Sai Sri",1289.56);

        Policy p3 = new Policy("1437","Sajid",1567.56);

        Policy p4 = new Policy("1438","Datta",1689.56);

        Policy p5 = new Policy("1439","Krish",1179.56);

        Policy p6 = new Policy("1440","Pandey",2009.56);

        Policy p7 = new Policy("1441","Akki",2156.00);

        List<Policy> policies = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);

        List<Policy> permium_filter= policies.stream().filter(c ->c.premium_amount>1200).collect(Collectors.toList());

        permium_filter.stream().forEach(System.out::println);

        System.out.println("_2 )____________________Sorting using name____________________");

        policies.stream().sorted((c1,c2) ->c1.getHolder_name().compareTo(c2.getHolder_name())).forEach(System.out::println);

        System.out.println("_3 )_____________________Compute Total Premium__________________");

        double total = policies.stream().map( c -> c.getPremium_amount()).reduce(0.00,(c1,c2)->c1+c2);

        System.out.println();

        System.out.println("The total premium "+total);

        System.out.println("_4 )_____________________Print Policy Details___________________");

        policies.stream().forEach(System.out::println);

        System.out.println("_5 )_____________________Filter Policies by Premium Range___________________\n");
        Predicate<Policy> start = c -> c.premium_amount >1000;
        Predicate<Policy> end = c -> c.premium_amount<2000;
        policies.stream().filter(start.and(end)).collect(Collectors.toList()).forEach(System.out::println);
//        System.out.println(range);

//        policies.stream().filter(c ->c.getPremium_amount()<2000).filter(c ->c.getPremium_amount()>1000).forEach(System.out::println);
        System.out.println("_6 )______________________Find Policy with Highest Premium_________________________________________________________\n");

        Policy p = policies.stream().max((c1,c2) ->Double.compare(c1.getPremium_amount(), c2.getPremium_amount())).get();
        System.out.println(p);
    }

}
