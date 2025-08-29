package Day7;
import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an ASCII code (0-128): ");
        int code = sc.nextInt();

        if (code >= 0 && code <= 128) {
            char character = (char) code;
            System.out.println("The character for ASCII code " + code + " is: " + character);
        } else {
            System.out.println("Invalid ASCII code! Enter between 0 and 128.");
        }

        sc.close();
    }
}
