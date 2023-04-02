public class MatheRechner {


    public static void addition(int a, int b) {

        System.out.println("addieren " + (a + b));
        //statische M ist an KLasse gebunden
        //nicht statische M ist an Objekt gebunden

    }

    public static void subtraktion(int a, int b) {
        System.out.println("subtrahieren " + (a - b));
    }

    public static void multiplikation(int a, int b) {
        System.out.println("multiplizieren " + (a * b));
    }

    public static void division(int a, int b) {
        System.out.println("dividieren " + (a / b));
    }

}
