import java.util.Scanner;

public class WelcherMonat {
    public static void main(String[] args) {
        int tageMonat = tageMonat();
        System.out.println("Aus der Main-Methode; der Monat hat " + tageMonat);

    }


    public static int tageMonat() {
        Scanner scannerMonat = new Scanner(System.in);
        System.out.println("Bitte den Monat in Worten und ohne Umlaute eingeben. Wir zeigen Ihnen wieviele tage");
                String monat = scannerMonat.next(); //user gibt monat ein,
       // monat = monat.toLowerCase(); //so vermeide ich user-eingabe-Fehler; kanns auch anstatt bei switch eingeben
        String vergleichsmonat = "mai";
        switch (monat = monat.toLowerCase()) { //hier habe ich die variable nicht verändert; und console gibts mir genau so aus wie ich es eingegeben habe
            case "januar":
                case "maerz":
            case "mai":
            case "juli":
            case "august":
            case "oktober":
            case "dezember":
                System.out.println("hat 31 Tage");
                break;
            case "feber":
                System.out.println("hat 28 Tage");

                break;
            case "april":
            case "juni":
                case "september":
            case "november":
                System.out.println("hat 30 Tage");

        }
        return tageMonat();
    }





    }

