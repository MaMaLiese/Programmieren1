import java.util.Arrays;

public class Arrays_G {
    public static void main(String[] args) {
        //passender
        String[] test = new String[100]; //beschreibt wieviele positionen unser index hat. des
        int geradeZahl = 2;

        for (int i = 0; i<=99; i++) {
            test[i] = Integer.toString(geradeZahl); // wenn oben int[] brauch ich nur das Integer.toString nicht, also test[i] = geradeZahl;
            geradeZahl = geradeZahl + 2;
        }
        System.out.println(Arrays.toString(test));




    }
}
