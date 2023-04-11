import java.util.Arrays; //zuhause musste ich class 'Arrays' importieren

public class StringArray {
    public static void main(String[] args) {
        String[] name = new String[5]; //Größe v Array ist fix!!!
        name[0] = "Manfred";
        name[1] = "Marianne";
        name[2] = "Marlene";
        name[3] = "Manuela";
        name[4] = "Marlies";

        System.out.println("Name an dritter Stelle: " + name[2]);

        System.out.println(Arrays.toString(name)); //gibt alle Elemente des Arrays aus

        //schnellere Version:
        String[] name2 = {"Manfred", "Marianne", "Marlene", "Manu", "Liesl"};
        System.out.println(Arrays.toString(name2));

        //change value of element:
        name[1]="Mama";
        System.out.println(Arrays.toString(name));


    //erstelle Array Typ String und befülle es mit geraden Zahlen von 2 bis 100

        String[] evenArray = new String[50];
        int evenInt = 2;
        for (int i = 0; i <= 49; i++) {
            evenArray[i] = Integer.toString(evenInt);
            evenInt = evenInt + 2;
        }
        System.out.println(Arrays.toString(evenArray));

    //find out how many elements Array has:
        System.out.println(evenArray.length);



    //erstelle Array Typ Int und befülle mit geraden Zahlen von 2 bis 100

    }
}