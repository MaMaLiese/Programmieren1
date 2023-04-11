// int [][] arrayOfArrays;
// arrayOfArrays
public class MultiArray {
    public static void main(String[] args) {
        int [][] MultiArray = {
                {0, 1, 0, 0, 0, 1, 0}, // Beistrich heißt da kommt noch was
                {1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}

        };
        //für zweidim Array brauchen wir 2 for-loops
        //für äußeren Array gehn wir jede zeile durch
        for (int[] row : MultiArray){
            for (int item : row) {
                if (item == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("X");

                }
            }
            System.out.println(); //gibt line-break aus
        }
    }
}
