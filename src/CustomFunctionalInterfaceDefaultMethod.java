@java.lang.FunctionalInterface
interface CustomFunctionalInterfaceDefaultMethod {
    int square(int n);
    default void display(int n)
    {

        System.out.println("square of the number "+square(n));
    }

}
class Custom  {
    public static void main(String[] args) {


        CustomFunctionalInterfaceDefaultMethod ob1 = (n) -> n * n;
        ob1.display(5);
    }

}
