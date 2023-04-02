import java.util.Scanner;

public class Wiederholung {
    public static void main(String[] args) {
        String text = "Programmierer lieben Java!\n"
                + "Es ist einfach einen Code zu schreiben\n"
                + "wenn man die Syntax kennt\n";
        Scanner scanner2 = new Scanner (text);
        System.out.println("Erster Aufruf " + scanner2.nextLine());
        System.out.println("Zweiter Aufruf " + scanner2.nextLine());
        System.out.println("Dritter Aufruf " + scanner2.nextLine());
        //-- hasnext()
        String text3 = "Hallo Welt heute schön";

        //int counter = 0;
        //while(scanner2.hasNext()) { //falls scanner noch einen nächsten Text zum einlesen hat
        //    System.out.println(scanner2.next()); //
          //  System.out.println();

        String vorname;  //deklarieren zuvor und nur einmal dh immer am Anfang einer Methode
        String nachname;

        //has next : fragt gibt es noch eine Variable im scanner, gut für Schleifen



        Scanner scanner1 = new Scanner (System.in);
        System.out.println("Type your First Name in");
        vorname = scanner1.nextLine();
        System.out.println(vorname);

        System.out.println("Type your Second Name in");
        nachname = scanner1.nextLine();
        System.out.println(nachname);

        int age;
        boolean bool;

        System.out.println("Type your Age: ");
        age = scanner1.nextInt();
        System.out.println(age);


        String name = vorname.concat(" " + nachname); //geht auch String name = vorname + " " + nachname;
        //ist Inhalt > 10?
        bool = name.length() > 10;
        System.out.println("Willkommen " + name.toUpperCase());
        System.out.println("Die Laenge ist groesser 10: " + bool + " und die exakte Laenge ist: " + name.length());

    }
}
