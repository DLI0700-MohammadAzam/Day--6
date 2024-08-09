import java.util.Scanner;

public class FunctionalInterfaceImplementation  {
    public static void main(String[] args) {

        FunctionalInterface obj = (a, b) -> (a+b);
        Scanner input = new Scanner(System.in);
        System.out.println("enter any two numbers");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("The sum of the two number is "+obj.sum(a,b));
    }

}
