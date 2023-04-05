import java.util.Scanner;

public class ForLoop { //When you know exactly how many times you want to loop through a block of code
    //Statement 1 is executed (one time) before the execution of the code block. bzw. sets a variable before the loop starts
    //Statement 2 defines the condition for executing the code block.
    //Statement 3 is executed (every time) after the code block has been executed.
    public static void main(String[] args) {
        //prints the numbers 0 to 4
        for (int i=0; i<=4; i++) {
            System.out.println(i);
        }
        int sum = 0;
        //zählt die Zahlen von 1 bis 10 zusammen
        for(int i=0; i<=10; i++){
            sum = sum +i;
        }
        System.out.println(sum);

        //Versuch die Startzahl ab der zusammengezählt wird, (in console) selbst einzugeben
        Scanner eingabe = new Scanner(System.in);
        System.out.println("startzahl eingeben: ");




            for (int startzahl = eingabe.nextInt(); startzahl <= 10; startzahl++) {
                sum = sum + startzahl;
            }
        System.out.println(sum);

         //prints only even numbers between 0 and 10
        for(int i=0; i <=10; i = i+2){
            System.out.println(i);
        }

            //printet 5 mal yayy loopen und schreibt die wiederholungen dazu
            for (int i = 0; i < 5; i++) {
            System.out.println("yayyyyyy loopen" + i);
        }


    }
}
