import java.util.Arrays;

public class UE_Multiarray {
    public static void main(String[] args) {
        int [][][][] kastln = new int [4][3][2][2];
        int elementCounter = 0;

        for(int i = 0; i < kastln.length; i++) {
            for (int j = 0; j < kastln[i].length; j++) {
                for(int k = 0; k < kastln[i][j].length; k++) {
                    for (int l = 0; l < kastln[i][j][k].length; l++){
                        System.out.println(kastln[i][j][k][l]+" ");
                        elementCounter++;
                    }
                }
            }

            //gleiches, nur mit for : each - Schleife
//            int elementCounter2 = 0;
//            for (int[][][] i : kastln){
//                for (int[][] j : i) {
//                    for (int[] k : j) {
//                        for (int l : k);
//            System.out.println(kastln + "");
//                        elementCounter2++;

                    }
                }

            }

//        }
//
//    }
//}
