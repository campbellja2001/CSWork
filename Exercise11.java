public class Exercise11 {
    public static void main(String[] args) {
        padString("hello", 8);
        padString("congratulations", 10);
    }

    public static void padString(String word, int num) {
        int stringLen = word.length();
        int num2 = num - stringLen;
        System.out.print(word);
        for (int i=1; i <= num2; i++) {
            System.out.print(" ");
        }
        //asterisk used as place marker to ensure proper execution
        System.out.print("*");
        System.out.println();
    }
}
