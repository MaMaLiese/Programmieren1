import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Erstes Return: ");

        String string1 = scanner1.nextLine();
        System.out.println(string1);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Zweites Return:");

        String string2 = scanner2.nextLine();
        System.out.println(string2);

        System.out.println(string1.equals(string2));



    }
}
