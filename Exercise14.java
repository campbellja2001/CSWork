import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        inputBirthday(console);
    }

    public static void inputBirthday(Scanner console) {
        System.out.println("What is the name of the month you were born?");
        String month = console.next();
        System.out.println("What day of the month were you born?");
        int day = console.nextInt();
        System.out.println("What year were you born?");
        int year = console.nextInt();

        System.out.println("You were born on " + month + " " + day + ", " + year + ".");
    }
}
