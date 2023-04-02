public class FaktorialMethodeFor {
    public static void main(String[] args) {
        int i = 0;
        int factorial = 1;
        int number = 90;
        for(i=1;i<=number;i++){
            factorial=factorial*i;
        }
        System.out.println("Die Fakultät von "+number+" ist: "+factorial);
}
