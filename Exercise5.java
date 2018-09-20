public class Exercise5 {
    public static void main(String[] args) {
        printGrid(4, 6);
    }

    public static void printGrid(int row, int column) {
        for (int i = 1; i <= row; i++) {
            int end = i + row * (column - 1);
            for (int j = i; j <= end; j += row) {
                System.out.print(j);
                if (j != end) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
