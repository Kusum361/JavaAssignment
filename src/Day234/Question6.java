package Day234;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        double perimeterCircle = 2 * Math.PI * r;
        System.out.println("Perimeter of Circle = " + perimeterCircle);

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();
        double perimeterRectangle = 2 * (l + b);
        System.out.println("Perimeter of Rectangle = " + perimeterRectangle);

        // Triangle
        System.out.print("Enter side1 of triangle: ");
        double s1 = sc.nextDouble();
        System.out.print("Enter side2 of triangle: ");
        double s2 = sc.nextDouble();
        System.out.print("Enter side3 of triangle: ");
        double s3 = sc.nextDouble();
        double perimeterTriangle = s1 + s2 + s3;
        System.out.println("Perimeter of Triangle = " + perimeterTriangle);

        sc.close();
    }
}
