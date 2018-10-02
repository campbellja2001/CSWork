public class Exercise8 {
    public static void main(String[] args) {
        quadratic(1, -7, 12);
        quadratic(1, 3, 2);
    }

    public static void quadratic(double a, double b, double c) {
        double x1 = ((0 - b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        double x2 = ((0 - b) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        System.out.println("x = " + x1 + ", x = " + x2);
    }
}
