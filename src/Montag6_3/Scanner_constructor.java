package Montag6_3;

import java.util.Scanner;

public class Scanner_constructor {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Please write something:");
          int number = scanner.nextInt(); //nextInt ist schon im scanner

        Cat mieze = new Cat( true,  true,  "Grey",  4);
        Cat schnurrbert = new Cat( true,  true,  "Grey",  4);
        Cat cookie = new Cat( true,  true,  "Grey",  4);



    }
}
