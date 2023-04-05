public class DoWhile {
    //The loop will always be executed at least once, even if the condition is false,
    //because the code block is executed before the condition is tested
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println(i);
            i++;
        } while (i==5); //(i<5); oder (i==3); etc...



        //man muss immer schaun, dass sich innerh. unseres Codeblocks etwas ändert (b++), sonst rennt der loop infinite
        int b = 1;

        while (b < 2) {
            System.out.println(2);
            b++;
        }
    }
}
