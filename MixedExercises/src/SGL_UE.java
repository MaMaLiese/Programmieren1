import javax.naming.OperationNotSupportedException;
import java.util.Scanner;

public class SGL_UE {
    public static void main(String[] args) {
        String vorname = "Marlies ";
        String nachname = "Marko";
        String name = vorname +" "+ nachname; //oder mit .concat:
       // String name = vorname.concat(" " + nachname);
        System.out.println(name);
        System.out.println("Willkommen " + (name.toUpperCase() + "!!!"));

        int ups = 23;
        ups = ups + 1;
        //ups = ++ups;
        System.out.println(++ups);



//        Scanner ausleser = new Scanner(System.in);
//        System.out.println("Das ist zum testen. Gib was ein: " );
//        String lesen = ausleser.nextLine();
//        System.out.println("Du hast " + lesen + " eingegeben.");
//        System.out.println("Das ist auch zum testen. Gib eine int-Zahl ein:");
//        int zahlLesen = ausleser.nextInt();
//        System.out.println("Du hast " + zahlLesen + " eingegeben.");

//        int probeZahl;
//        probeZahl = 13 + 9;
//        System.out.println(probeZahl);
//
//        probeZahl = probeZahl + 3;
//        System.out.println(probeZahl);
//        probeZahl = probeZahl - 3;
//        System.out.println(probeZahl);
//        probeZahl = probeZahl / 2;
//        probeZahl = probeZahl * 4.25;
//        System.out.println(probeZahl);
//        probeZahl = 56 * 2;
//        System.out.println(probeZahl);
        String nameBsp = "Marlies ";


      // nameBsp = nameBsp + "Marko ";
        System.out.println(nameBsp);
        //nameBsp = nameBsp.concat("Studentin");
        System.out.println(nameBsp);
        System.out.println(nameBsp.length());
        System.out.println(nameBsp.toUpperCase());
        System.out.println(nameBsp.substring(5,7));
        System.out.println(nameBsp.equals("Marlies "));



    }
}
