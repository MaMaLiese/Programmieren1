import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        Scanner cmdReader = new Scanner(System.in);
        System.out.println("Bitte gib deinen Namen ein: ");
        String nameMM = cmdReader.nextLine();
        System.out.println(nameMM + " aha...und jetzt bitte noch dein Alter:");
        int alterMM = cmdReader.nextInt();
        System.out.println(alterMM +"!!! Wow. Wir sind hier fertig");


    }
}
