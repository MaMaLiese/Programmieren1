import java.util.Scanner;

public class UserPW {
    public static void main(String[] args) {

        Scanner scanPW = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihr Passwort ein: ");
        String passwort = "geheim";
        String eingabePW;


//deklarationen nie in Schleife reingeben und ausserhalb von if-anweisungen
        do {
            System.out.println("nochmal");
            eingabePW = scanPW.next();





        }

        while (!eingabePW.equals(passwort));
        System.out.println("supi");
//            eingabePW = scanPW.nextLine();
//        }


    }
}
