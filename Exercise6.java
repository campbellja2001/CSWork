public class Exercise6 {
    public static void main(String[] args) {
        largerAbsVal(11, 2);
        largerAbsVal(4, -5);
    }

    public static void largerAbsVal(int val1, int val2) {
        //Sets the numbers to their absolute value (If negative, makes positive, does nothing if positive)
        if (val1 < 0) {
            val1 = 0 - val1;
        }

        if (val2 < 0) {
            val2 = 0 - val2;
        }

        //Checks which of the values is larger
        if (val1 > val2) {
            System.out.println(val1);
        }

        else {
            System.out.println(val2);
        }
    }
}
