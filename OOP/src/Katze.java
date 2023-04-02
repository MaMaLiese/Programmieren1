import java.util.Scanner;

public class Katze {
    String nameKatze; //um name private zu machen ---private String nameKatze; wenn nichts davor steht ist das gleich
    //zu setzen mit "public"
    int alterKatze;
    String rasseKatze;
    boolean kannTrick;

    public Katze(String n, int a, String r, boolean kt) { //geht auch ohne "public
        nameKatze = n;
        alterKatze = a;
        rasseKatze = r;
        kannTrick = kt;
    }


    public void knurren(){
        System.out.println("knrrrr");
    }


    public void kannTrickMachen() {

        if (kannTrick) {

            System.out.println("Trick gelungen");

        } else {
            System.out.println("Trick nicht gelungen");
        }
    }
}
