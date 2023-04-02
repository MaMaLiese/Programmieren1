public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println();

        //static wird aufgeklärt....Methode aufrufen, ohne Objekt erzeugen zu müsssen....main-methode muss also statisch
        //sein, sonst könnte ich Programm nie aufrufen.
       // Mathe.maximumBerechnen() ---> Mathe großgeschrieben, deshalb weiß ich, dass ist eine Klasse
        //nicht statische Methode: zusätzliche Zeile, wo ich das Objekt erzeuge und dann ....Mathe m1 = new Mathe();

        MatheRechner.addition(a, b);
        MatheRechner.subtraktion(a, b);
        MatheRechner.multiplikation(a, b);
        MatheRechner.division(a, b);

        //statische Variablen nur verwenden für Attribute, die nicht direkt etwas mit dem Objekt zu tun haben. wie zB couterAuto
    }
}
