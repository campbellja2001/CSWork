public class exercise9 {
    public static void main(String[] args) {
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 2; b++) {
                System.out.print("----");
            }
        }
        System.out.println();
        for (int c = 1; c <= 10; c++) {
            System.out.print("_-^-");
        }
        System.out.println();
        for (int d = 1; d <= 2; d++) {
            for(int e = 1;e <= 9; e++) {
                for (int f = 1; f <= 2; f++) {
                    System.out.print(e);
                    }
                if (e == 9) {
                    System.out.print("00");
                }
            }
        }
        System.out.println();
        for (int g=1; g<=5; g++) {
            for (int h=1; h <= 2; h++) {
                System.out.print("----");
            }
        }
    }
}
