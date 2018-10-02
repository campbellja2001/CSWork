public class Exercise9 {
    public static void main(String[] args) {
        distance(1, 0, 4, 4);
        distance(10, 2, 3,5);
    }

    public static void distance(double x1, double y1, double x2, double y2) {
        double a = x2 - x1;
        double b = y2 - y1;
        double d = Math.sqrt((a * a) + (b *b));
        System.out.println(d);
    }
}