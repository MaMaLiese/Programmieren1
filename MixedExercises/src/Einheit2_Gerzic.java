import java.util.Scanner;

public class Einheit2_Gerzic {
    public static void main(String[] args) {
        //Schleifen zählen beginnt (in Java) bei 0 und zählt ersten einstieg schon mit
        boolean zaehler = true;
        System.out.println("Bitte eine int-Zahl kleiner 10 eingeben");
        Scanner scannerUE = new Scanner(System.in);
        //Sicher gehen, dass user richtige zahl eingibt
        //kopfgesteuerte: wenn wir vorher prüfen wollen, ob wir überhaupt in Schleife müssen (for-schleife)
        //fussgesteuerte: wenn wir gleich in Schleife einsteigen (do-while)
        //sum=sum+i entspricht sum += i

        //Anm.: ! entspricht - vor Klammer ---> dreht einfach das in Klammer um
        int zahl = scannerUE.nextInt();

        while(zaehler){
            System.out.println("Nummer: " + zahl);
            if(zahl <= 10){
                zaehler = false;
            }
            zahl++;
        }
    }
}
