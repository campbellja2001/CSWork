public class exercise3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(b);
        for (int c = 1; c <= 11; c ++)
        {
            int d = a + b;
            a = b;
            b = d;
            System.out.print(" " + d);
        }
    }
}
