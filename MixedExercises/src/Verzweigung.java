import java.util.Scanner;

public class Verzweigung {
    public static void main(String[] args) {
        Scanner scannerNummer = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben");
        int nummer = scannerNummer.nextInt();

        if (nummer > 5) {
            System.out.println("Nummer ist größer als 5");
        } else if (nummer < 5) {
            System.out.println("Nummer ist kleiner als 5");
        } else { // bräuchte else inkl {} garnicht
            System.out.println("Nummer ist wohl genau 5");
        }
    }
}
