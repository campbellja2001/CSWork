public class Exercise2 {
    public static void main(String[] args) {
        printPowersOf2(3);
        printPowersOf2(10);
    }

    public static void printPowersOf2(int number) {
        int a = 1;
        System.out.print(a + " ");
        for (int i = 1; i <= number; i++) {
            a = a * 2;
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
