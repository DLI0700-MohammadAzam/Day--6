public class Circle {
    public static void main(String[] args) {

        double PI =3.14 ;
        FunctionInterfaceCircle c1 = r ->(PI * r * r);
        double radius =3.5;
        System.out.println("Area of the circle is "+c1.area(radius));

    }
}
