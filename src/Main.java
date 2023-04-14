public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle (5.0, 6.0);
        System.out.println(rect1);
        System.out.println("Area is: " + rect1.getArea());

        Square square1 = new Square (5.3);
        System.out.println(square1);
        System.out.println("Area is " + square1.getArea());
    }
}