package Day234;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        double kg = pounds * 0.454;

        System.out.println(pounds + " pounds is equal to " + kg + " kilograms.");

        sc.close();
    }
}
