import java.util.Scanner;

public class Hund {
    String nameHund;
    String rasseHund;
    int alterHund;
    String farbeHund;
    String bellen = "wuff wuff";
    public void bellen() {

        //void heißt dass void keinen rückgabewert
        //wenn doch ändere ich void auf zB boolean


        System.out.println("wuff wuff");
    }

//        public void gibMirInfo() {
//            System.out.println("Der Hund " + hund1.nameHund + " ist ein " + hund1.rasseHund + " und ist " + hund1.alterHund + " Jahre alt");
//        }


       //Rückgabewert
        public boolean kannStockBringen(){
            System.out.println("Bitte Y oder N eingeben: ");
                Scanner input = new Scanner(System.in);
                if(input.next().equals("Y")) {

                    // System.out.println("Er kann Stock bringen");
                    return true;
                } else {
                    return false;
                }
        }
    }









