public class Exercise10 {
    public static void main(String[] args) {
        scientific(6.23, 5);
        scientific(1.9, -2);
    }

    public static void scientific(double base, int exp) {
        if (exp < 0) {
            for (int i = -1; i >= exp; i--) {
                base = base * 0.1;
            }
        }
        for (int i = 1; i<= exp; i++) {
            base = base * 10;
        }
        System.out.println(base);
    }
}
