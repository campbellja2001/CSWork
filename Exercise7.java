public class Exercise7 {
    public static void main(String[] args) {
        largerAbsVal(7, -2, -11);
        largerAbsVal(-4, 5, 2);
    }

    public static void largerAbsVal(int val1, int val2, int val3) {
        //Sets the numbers to their absolute value (If negative, makes positive, does nothing if positive)
        if (val1 < 0) {
            val1 = 0 - val1;
        }

        if (val2 < 0) {
            val2 = 0 - val2;
        }

        if (val3 < 0) {
            val3 = 0 - val3;
        }

        //Checks which of the values is larger
        if (val1 > val2 && val1 > val3) {
            System.out.println(val1);
        }

        else if (val2 > val1 && val2 > val3) {
            System.out.println(val2);
        }

        else {
            System.out.println(val3);
        }
    }
}
