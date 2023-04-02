public class MainRecursion {
    public static void main(String[] args) {
        lesen();
    }
    public static void lesen() {
        System.out.println("Der Pinguin schlug die Zeitung auf, da stand: ");
        lesen();
        //warum nehme ich for-schleife wenn ich jedes einzelne Element von Array ausgeben will: wenn ich weiss wie Oft wiederholt wird...
        //zweite schlüssige Antwort...wegen i (i ist unser counter)
        //für while schleife müsste ich i erst....
    }
    public static void rekursion(int counter) {
        if(counter ==0){
            System.out.println(" --- wir sind hier fertig, der counter hat den wert " + counter + " erreicht! ....");
            return;

        }
        System.out.println("countdown läuft, nur noch "+counter+"sekunden");
        counter = counter -1; //counter --

        //selbstaufruf der rekursion mit verändertem Wert
        rekursion(counter);


    }
}
