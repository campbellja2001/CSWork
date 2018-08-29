public class exercise7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int a = 5; a >= i; a--) {
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.println();
        }
    }
}
