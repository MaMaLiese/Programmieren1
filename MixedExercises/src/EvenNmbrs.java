public class EvenNmbrs {
    public static void main(String[] args) {
        //wenn wir wissen wie oft wirs wh wollen nehmen wir for
        //in for-schleife geh ich rein, wenn bedingung true


        for (int i = 1; i <= 10; i++) { //i++ (entspricht i = i +1) damit Schleife keine Endlosschleife wird
            System.out.println(i);
        }
        System.out.println(" ---------------- ");

        for (int i = 0; i <= 30; i = i + 2) { //oder i += 2 als kuerzere Schreibweise
            //die anderen habens mit if-schleife inkl. modulo % gemacht
            System.out.println(i);
        }
    }
}
