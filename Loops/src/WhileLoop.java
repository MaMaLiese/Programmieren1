import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanFrageuser = new Scanner (System.in);
        System.out.println("Bitte ganze positive Zahl eingeben. Wir berechnen die Summe bis dahin");
        int n = scanFrageuser.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum +i;
            //sum += i;
            i++;
        }
        System.out.println("Summe aller Zahlen von 1 bis " + n + " ist " + sum + ".");


    }
}
