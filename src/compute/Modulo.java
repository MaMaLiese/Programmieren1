package compute;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        int number ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = 3;

        int result = firstNumber % secondNumber;
        if (result == 0) {
            System.out.println("The number is divisible");
        } else {
            System.out.println("it is nicht durch 3 teilbar");
        }

    }
}
