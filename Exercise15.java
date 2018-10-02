import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        processName(console);
    }

    public static void processName(Scanner console) {
        System.out.print("Please enter your full name: ");
        String firstName = console.next();
        String lastName = console.next();
        System.out.println("Your name in reverse is: " + lastName + ", " + firstName);
    }
}
