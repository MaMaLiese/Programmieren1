import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in) ;//create Scanner-object in Scanner-class
        //int somethingSomething = (8+4);
        System.out.println("What is: ");

        String s = "Großbuchstaben Vile";
        s.toLowerCase();

        int somethingSomething = myScanner.nextInt(); //read user input
        System.out.println((somethingSomething + somethingSomething) + ""); //output des userinput

        System.out.println("Good bye world");

        int myValue = 8;
        double myDecimal = myValue;
        System.out.print(myValue + " ");
        System.out.println(myDecimal);


        System.out.println((12 + 78));
        System.out.println((14 == 19));
        System.out.println("Die Summe ist:" + (13+8));
    }
}
