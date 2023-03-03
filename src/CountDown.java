public class CountDown {
    public static void main(String[] args) {
        int startingNumber = 15;

        countDown(startingNumber);
    }




public static void countDown(int startingNumber) {
        System.out.println(startingNumber);
while (startingNumber != 0) {
    startingNumber = startingNumber - 1;
    System.out.println(startingNumber);
}

}

}
