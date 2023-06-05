public class VerschchtlteFor {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {


            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Executes 6 times (2 * 3)
            }
            System.out.println();
        }

    }
}
