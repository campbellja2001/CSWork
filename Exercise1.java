public class Exercise1 {
    public static void main(String[] args) {
        printNumbers(15);
        printNumbers(5);
    }

    public static void printNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("[" + i + "] ");
        }
        System.out.println();
    }
}
