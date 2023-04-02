import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Faust {
    public static void main(String[] args) throws Exception {
        //NUR DEN PFAD zur TXT-Datei, welche wir unten rauchen, in die STring-Variable namens file speicher
        String file = "C:\\Users\\s53031\\IdeaProjects\\Downloads\\faust.txt";
        //wir weisen der STring-Variable einen Pfad zu


        Scanner buchText = new Scanner(Paths.get(file)); //paths ist eigene classe/funktion und muss importiert werden
        //nicht mehr System.in der aus console einliest, sondern paths.get(file) ... der
        Scanner fuerWort = new Scanner(System.in);
        System.out.println("Geben Sie bitte das Wort ein, welches gezaehlt werden soll (Gross & Kleinschreibung ist egal): ");
        //wieso .next : holt nur Wort für Wort //wieso .nextln : liest ganze Zeile
        String faustWort = fuerWort.next();
        faustWort = faustWort.toLowerCase();
        String wort;

        int z = 0; //counter
        while (buchText.hasNext()) {
             wort = buchText.next();
             wort = wort.toLowerCase();
            if (faustWort.equals(fuerWort));
            z++;

        }
        System.out.println(z);
    }
}
