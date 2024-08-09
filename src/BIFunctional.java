import java.util.function.BiFunction;

class BiFunctionInterface
{
    public static void main(String[] args) {


        BiFunction<String, String, String> concat = (str1, str2) -> str1 + " " + str2;
        String result = concat.apply("Azam", "Maza");
        System.out.println(result);
    }
}