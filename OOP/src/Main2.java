public class Main2 {
    public static void main(String[] args) {
        Hund hund1 = new Hund();
        hund1.nameHund = "Wauzi";
        hund1.alterHund = 8;
        hund1.rasseHund = "Terrier";
        hund1.farbeHund = "weiß";

        hund1.bellen();
        System.out.println("Der Hund " + hund1.nameHund + " ist ein " + hund1.rasseHund + " und ist " + hund1.alterHund + " Jahre alt");

        //kann Hund Stöckchen holen?

        System.out.println("Kann er Stock bringen? "+hund1.kannStockBringen());

        Katze katze1 = new Katze("kittikatti",4,"promenade",true);
        System.out.println("Die Katze heisst: "+katze1.nameKatze);

        katze1.nameKatze = "Minki";
        System.out.println("Die Katze heisst nun "+katze1.nameKatze);

        katze1.nameKatze = "Kittikatti";
        katze1.alterKatze = 4;
        katze1.rasseKatze = "promenade";
        katze1.kannTrick = true;

        katze1.knurren();

        System.out.println(katze1.kannTrick);



//        hund1.gibMirInfo();




    }
}
