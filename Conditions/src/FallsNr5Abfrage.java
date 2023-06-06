import java.util.Scanner;

public class FallsNr5Abfrage {
    public static void main(String[] args) {
        Scanner scannerNummer = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben");
        int nummer = scannerNummer.nextInt(); //Hier wird die Eingabe des Nutzers von der Konsole in die Variable nummer gespeichert

        //Falls die variable nummer > 5 dann TRUE und wir gehen in die IF hinein, ansonsten springen wir runter zu else
        if (nummer > 5) {
            //Falls diese IF-Anweisung TRUE zurueckgibt, dann gib nachfolgendes aus
            System.out.println("Nummer ist größer als 5");
        } else if (nummer < 5) {//Falls oben FALSE rauskommt, dann spring auf jeden Fall hier hinein, MM: und pruefe gleich weiter
            System.out.println("Nummer ist kleiner als 5");
        } else { // bräuchte else inkl {} garnicht
            System.out.println("Nummer ist wohl genau 5");
        }
    }
}
