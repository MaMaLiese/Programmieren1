import java.util.Scanner;

public class G_Teil1Uebungen {

    public static void main(String[] args) {
       // cashMenu();
        Scanner console1 = new Scanner(System.in);
//-------------------->

//--------------------> Gerzic Teil 1_UE2

//        System.out.println("Bitte gib eine ganze Zahl zwischen 1 und 10 (inkl.) ein:");
//        int eingabeZahl = console1.nextInt();
//        while(eingabeZahl < 1 || eingabeZahl > 10) {
//            System.out.println("Inkorrekte Zahl. Bitte waehle eine Zahl zwischen 1 und 10 (inkl.)!!!");
//            eingabeZahl = console1.nextInt();
//
//        }
//
//
//        switch (eingabeZahl) {
//            case 1:
//                System.out.println("one");
//                break;
//            case 2:
//                System.out.println("two");
//                break;
//            case 3:
//                System.out.println("three");
//                break;
//            case 4:
//                System.out.println("four");
//                break;
//            case 5:
//                System.out.println("five");
//                break;
//            case 6:
//                System.out.println("six");
//                break;
//            case 7:
//                System.out.println("seven");
//                break;
//            case 8:
//                System.out.println("eight");
//                break;
//            case 9:
//                System.out.println("nine");
//                break;
//            case 10:
//                System.out.println("ten");
//                break;
//
//                //Frage: es geht, ohne default zu definieren. Ist das ok?
//        }

//        ---------------------------------->Gerzic Teil 1_UE3:

        System.out.println("Please enter your account balance: ");
        double balanceInput = console1.nextDouble();
        cashMenu();


//        System.out.println("Menu: ");
//        System.out.println("1. Deposit");
//        System.out.println("2. Withdraw");
//        System.out.println("3. Check Balance");
//        System.out.println("4. Exit");
//        System.out.println("Enter your choice: ");

        short menuChoice = console1.nextShort();

        switch (menuChoice) {
            case 1:
                System.out.println("Please type in the amount you want to DEPOSIT:");
                double deposit = console1.nextDouble();
                System.out.println("Your deposit of " + deposit + " was successful. Your account balance is now " + (balanceInput + deposit));
                System.out.println("Return to Menu by pressing any key");
                console1.next();
                cashMenu();
                break;
            case 2:
                System.out.println("Please type in the amount you want to WITHDRAW:");
                double withdraw = console1.nextDouble();
                System.out.println("Success! After this withdraw of " + withdraw + "your account balance is now " + (balanceInput - withdraw));
                break;
            default:
                System.out.println("test");


        }
    }
        public static void cashMenu() {

            System.out.println("Menu: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

        }

}
