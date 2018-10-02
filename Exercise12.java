public class Exercise12 {
    public static void main(String[] args) {
        vertical("hey now");
    }

    public static void vertical(String text) {
        for (int i = 0; i <= text.length() - 1; i ++)
        System.out.println(text.charAt(i));
    }
}
