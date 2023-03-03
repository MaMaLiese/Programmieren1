public class DoCount {
    public static void main(String[] args) {
        int startingNumber = 50;

        countUp(startingNumber);

    }
    public static void countUp(int startingNumber) {
    do {
        System.out.println(startingNumber);
        startingNumber++;
    } while (startingNumber <= 100);
    //bei do while is vor condition. er druckt starting number also aus; do while-schleife ist sozusagen
        //die while-schleife auf den Kopf gestellt, condition wird erst nachher überprüft
        //problem dass auftauchen kann ist, dass man infinite loop bekommt
    }
}
