package typeConversion;

import java.util.Scanner;

public class intExplicit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number: ");
        double number = scanner.nextDouble();

        System.out.println("Before conversion " + number);

        int temp = (int) number;
        // speichert int in double bzw. konvertiert

        System.out.println ("After conversion " + temp);
        System.out.println((float) number);
        System.out.println((long) number);
        System.out.println((short) number);


        //Zahl (double) in String
        String stringNumber = Double.toString(number);
        System.out.println(stringNumber);

    }
}
