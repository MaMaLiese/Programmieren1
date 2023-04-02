package typeConversion;
import java.util.Scanner; //shorcut alt + einf


public class StringConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String input = scanner.nextLine();

        //convert to int
        //int intNumber = Integer.parseInt(input); //nimm string her und verwandle in int
        //System.out.println(intNumber);

        //convert to double
        double doubleNumber = Double.parseDouble(input);
        System.out.println(doubleNumber);
    }
}
