import java.util.Scanner;

public class Gerzic_UE2 {
    public static void main(String[] args) {
        Scanner aufforderung2 = new Scanner(System.in);
        System.out.println("Hey! Bitte gib eine Zahl zwischen 1 und 10 (inkl.) ein:");
        int zahlMM = aufforderung2.nextInt();

        while (zahlMM < 1 || zahlMM > 10) {

            System.out.println("Ungültige Zahl eingegeben! Bitte gib eine Zahl zwischen 1 und 10 (inkl.) ein: ");
            zahlMM = aufforderung2.nextInt();
        }

        switch (zahlMM) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
            default:
        }


    }

}
