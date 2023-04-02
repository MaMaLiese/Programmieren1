public class SimpleDatatypes {
    public static void main(String[] args) {
        // squareMeters
        int squareMeters;
        // pricePerSquareMeter double sind Kommazahlen
        double pricePerSquareMeter;
        // computer muss wissen wieviel Platz er braucht für jeweiligen Datentyp;
        // bei int hat er zb nur die byte-Anzahl frei die für int gebraucht wird.
        // kann also was größeres nicht in was kleineres speichern, aber was kleiners in was größeres
        // address
        String address;
        //String ist komplexer Datentyp, int u double schreibt nur Zahlen
        squareMeters = 500;
        pricePerSquareMeter = 10.5;

        address = "Hill Street 17";
        System.out.println("The price of the house at " + address + " is: " + squareMeters * pricePerSquareMeter);

        int zahl = 78 + 2;
        double kommaZahl = 80.9 + 1;
        System.out.println(kommaZahl);
        kommaZahl = zahl + kommaZahl;
        System.out.println(kommaZahl);

        //Uebung: Erstelle mittels boolean-Variable 'b' eine Abfrage:
        // ist ganzzahlige Variable 'a' mit dem Wert 100 größer oder gleich 110
        // Ausgabe von 'b' in der Konsole
        boolean b;
        int a = 140;
        b = a >= 110;
        System.out.println(b);


    }
}
