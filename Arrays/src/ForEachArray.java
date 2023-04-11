public class ForEachArray {
    public static void main(String[] args) {
        int[] firstArray = new int[5]; //5 = länge wieviele werte drinnen

        firstArray[0] = 1; //an erster Stelle ist der Wert 1
        firstArray[1] = 2;
        firstArray[2] = 3;
        firstArray[3] = 4;
        firstArray[4] = 5;

        int[] secondArray = new int[]{1, 2, 3, 4, 5}; //in firstArray und second Array gleiches drin

        for (int i = 0; i < firstArray.length; i++) {   //nur soweit gehen wie dieses Array lang ist
            //wir wollen an erste Stelle gelangen: und wir lassen den for-loop für uns arbeiten
            //beim ersten mal ist i 0, beim zweiten mal 1
            int itemInArray = firstArray[i];  //hier wird itemInArray NUR innerhalb der for-Schleife dekariert!!
            {
                System.out.println(itemInArray); //hier ausgabe der werte im array 1,2,3,4,5
                //    System.out.println(i);  //hier ausgabe der Positionen des array 0,1,2,3,4
            }

            //in loop für alles an jeder stelle das gleiche machen, enhanced for-loop, müssen aber
            //nicht mehr
            // for (int element : firstArray) {

            //für jedes int element in unserem (:) Array wollen wir etwas dass in den geschwungenen Klammern steht
            //in Array muss alles den gleichen Datentyp haben, aber ich kann jeden Datentyp verwenden
        }

        //wollen erstes array und wollen zu jedem Wert 12 dazuzählen
        //dafür:-----"for-each" loop, which is used exclusively to loop through elements in arrays
        //for each int-element (called "element", or "i" - as in index) in firstArray, print out the value of element (or i)

        System.out.println("-----------for-each------------");

        for (int element : firstArray) {
            element = element + 12;
            System.out.println(element);

        }

        for (int itemInArray : firstArray) {
            itemInArray=itemInArray +12;
            System.out.println(itemInArray);
        }


        System.out.println("-------------------");


        int[] thirdArray = new int[5];
        thirdArray[1] = 5;

        for (int i = 0; i < thirdArray.length; i++) {
            System.out.println(thirdArray[i]);

        }
    }
}
