import java.util.Scanner;

public class Gerzic_UE1 {
    public static void main(String[] args) {
        Scanner aufforderung = new Scanner(System.in);
        System.out.println("Hallo Du! Bitte gib' deinen Namen ein:");
        String nameMM = aufforderung.nextLine();
        System.out.println(nameMM + "...aha...Und jetzt bitte noch dein Alter: ");
        int ageMM = aufforderung.nextInt();
        System.out.println("Hallo " + nameMM + " du bist " + ageMM + " Jahre alt. ");
    }
}
