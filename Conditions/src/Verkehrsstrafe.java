import java.util.Scanner;

public class Verkehrsstrafe {
    public static void main(String[] args) {
       // double strafe = strafe(); //zb 250 ist Return-Wert; gesamtstrafe die unten in console rauskommt ; wir haben bevor wirs in Methode
        //initialisiert haben hier noch nicht initialisiert; erst wenn ich unten bei methode den returnwert eingebe ists oben auch initialisiert
        int geschwindigkeit;
        int ueberschreitung;

        Scanner scannerPopo = new Scanner (System.in);
        System.out.println("Gemessene Geschw eingeben: "); //ist nicht wichtig fürs einlesen aber ich weiß nicht was)
        geschwindigkeit = scannerPopo.nextInt(); //initialisierung durch händische eingabe; scannerPopo speichert nix, er weiß nur was mit nextInt() passiert
        ueberschreitung = geschwindigkeit - 50;

        double strafe = 10;
        if (ueberschreitung <= 0) {
            System.out.println("nix passiert"); // WH : ist nur damit etwas ausgegeben wird, wird aber nicht gespeichert
        } else if (ueberschreitung <= 10) { //brauche hier nicht Spanne && weil alles was kleiner Null ist vorher schon abgefragt
            System.out.println("Schriftl. Verwarnung");

        } else if (ueberschreitung <= 20) {
            System.out.println("Die Strafe beträgt 30");
            strafe = strafe + 30; //brauche hier nicht Spanne && weil alles was kleiner Null bzw kleiner 10 ist vorher schon abgefragt

        } else if (ueberschreitung <= 30) {
            System.out.println("Die Strafe beträgt 50 Euro");
            strafe = strafe + 50;

        } else if (ueberschreitung <= 50) {
            System.out.println("Die Strafe beträgt 100 Euro");
            strafe = strafe + 100;
        } else if (ueberschreitung <= 100) {
            System.out.println("Die Strafe beträgt 500 Euro");
            strafe = strafe + 500;
        } else {
            System.out.println("Die Strafe beträgt 1500 Euro");
            strafe = strafe + 1500;
        }

        System.out.println("Bitte den Monat schriftlich und ohne Umlaute eingeben");
        String monat = scannerPopo.next(); //user gibt monat ein,
        monat =monat.toLowerCase(); //so vermeide ich user-eingabe-Fehler
        switch (monat) {
            case "januar":
            case "feber":
                System.out.println("Leider kein Rabatt mögich");
                break;
            case "maerz":
            case "april":
                System.out.println("Es gibt 10 % Rabatt");
                strafe = strafe *0.9;
                break;
            case "mai":
            case "juni":
                System.out.println("Es gibt schon 15 % Rabatt");
                strafe = strafe * 0.85;
                break;
            case "juli":
            case "august":
                System.out.println("Es gibt massive 20 % Rabatt");
                strafe = strafe * 0.8;
                break;
            case "september":
            case "oktober":
                System.out.println("Es gibt huiii 25 % Rabatt");

        }




       //System.out.println("Gemessene Geschwindigkeit: " + geschwindigkeit);



    }

    //sobald bei methode int, double, float etc. mus ich return wert eingeben; wenn void brauch i keinen return Wert
}
