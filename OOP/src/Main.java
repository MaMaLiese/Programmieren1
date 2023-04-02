import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tamagochi tamagochi = new Tamagochi();


        tamagochi.x = 6;
        tamagochi.y = 4;
        tamagochi.futterStand = 5;

        //public void feed(int f) {

        for (int x = 0; x >= 1; x--) {


            tamagochi.move("links");
        }
        //public void bewegung(String r){
        if (futterStand < 1) {
            return;
        } else if (r.equals("links")) {
            x = x - 1; //x--
        } else if (r.equals("rechts")) {
            x = x + 1;
        } else if (r.equals("oben")) {
            y = y + 1;
        } else if (r.equals("unten")) {
            y = y - 1; //y--
        }
        futterStand = futterStand - 1; //f--
        System.out.println("x: " + x + " | y: " + y + " | f: " + futterStand);
    }







//        //Erstellen des Objekts t1
//        TN t1 = new TN();
//        t1.name = "Jaqueline";
//        t1.alter = 14;
//        t1.geschlecht = 'w';
//
//        System.out.println("Die Person " + t1.name + " ist "+ t1.alter+ " Jahre alt!");
//
//        //2. Person erstellen
//        TN t2 = new TN();
//        t2.name = "Quentin";
//        t2.alter = 25;
//        t2.geschlecht = 'm';
//
//        System.out.println("Die Person " + t2.name + " ist "+ t2.alter+ " Jahre alt!");
//
//
//        //Funktion des Objekts t1
//        t1.hatFrageGestellt();
//        t1.hatFrageGestellt();
//
//        System.out.println("Die Person " + t1.name + "hat "+ t1.fragenCounter + " Fragen gestellt");
//        System.out.println("Die Person " + t2.name + "hat "+ t2.fragenCounter + " Fragen gestellt");



    }
}
