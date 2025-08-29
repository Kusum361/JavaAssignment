package Day234;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        double areaCircle = Math.PI * r * r;
        System.out.println("Area of Circle = " + areaCircle);

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();
        double areaRectangle = l * b;
        System.out.println("Area of Rectangle = " + areaRectangle);

        // Triangle
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double h = sc.nextDouble();
        double areaTriangle = 0.5 * base * h;
        System.out.println("Area of Triangle = " + areaTriangle);

        sc.close();
    }
}


