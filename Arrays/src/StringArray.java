import java.util.Arrays; //zuhause musste ich class 'Arrays' importieren
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {

        //größe des Array dynamisch bzw. durch user definiert:
        Scanner eingabe = new Scanner(System.in);

        System.out.println("Wie viele Positionen soll das Array haben: ");
        int positionen = eingabe.nextInt();
        String[] throughInput = new String[positionen];
        System.out.println(" Damit mache ich jetzt nix, throughInput-Array nur zum probieren erstellt");
        //-------------------------------------------------------------------------------------


        String[] name = new String[5]; //Größe v Array ist fix!!!
        name[0] = "Manfred";
        name[1] = "Marianne";
        name[2] = "Marlene";
        name[3] = "Manuela";
        name[4] = "Marlies";

        System.out.println("Name an dritter Stelle: " + name[2]);

        System.out.println(Arrays.toString(name)); //gibt alle Elemente des Arrays aus

        //schnellere Version:
        //und ich kann auch String-Variablen als Wert hinzufügen:
        String kater = "Bjelo";
        String someFish = "Some fish";

        String[] name2 = {"Manfred", "Marianne", "Marlene", "Manu", "Liesl", kater, someFish};
        System.out.println(Arrays.toString(name2));

        //change value of element:
        name[1]="Mama";
        System.out.println(Arrays.toString(name));


    //erstelle Array Typ String und befülle es mit geraden Zahlen von 2 bis 100
        //mögliche Lösung: evenInt bei Übergabe ans Array in String umwandeln

        String[] evenStringArray = new String[50];
        int evenInt = 2;
        for (int i = 0; i <= 49; i++) {
            evenStringArray[i] = Integer.toString(evenInt);
            evenInt = evenInt + 2;
        }
        System.out.println(Arrays.toString(evenStringArray));



    //logische theoretische überleitung zur class ForEach_IntArray:

    //erstelle Array Typ Int und befülle es mit geraden Zahlen von 2 bis 100
        int[] evenIntArray = new int[50];
        evenInt = 2;
        for (int i = 0; i <= 49; i++) {
            evenIntArray[i] = evenInt;
            evenInt = evenInt + 2;
        }
        System.out.println(Arrays.toString(evenIntArray));



    }
}