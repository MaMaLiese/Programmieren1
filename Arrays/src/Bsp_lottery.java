//wollen speichern was wir als Lotto-Zahlen
//und welche Lotto zahlen tatsächlich kommen

public class Bsp_lottery {
    public static void main(String[] args) {
        int[] myLotteryGuesses = new int[6];
        myLotteryGuesses[0] = 7;
        myLotteryGuesses[1] = 28;
        myLotteryGuesses[2] = 33;
        myLotteryGuesses[3] = 42;
        myLotteryGuesses[4] = 13;
        myLotteryGuesses[5] = 19;

        int[] winningNumbers = getRandomLotteryNumbers(); //wir weisen unsere Methode dem Array zu      //new int[6];
        //wollen das zufällig machen; gleich methode

        int countMatches = 0;

        for (int i = 0; i < myLotteryGuesses.length; i++) {
            if (myLotteryGuesses[i] == winningNumbers[i])
            {
                countMatches = countMatches + 1; //kann auch countMatches++ schreiben

            }
        }

        if (countMatches == 6) {
            System.out.println("Jackpot");
        } else if (countMatches == 5) {
            System.out.println("Second Price");
        } else if (countMatches == 4) {
            System.out.println("Third Price");
        } else
            System.out.println("You lost!");
        }


        public static int[] getRandomLotteryNumbers () {
            int[] randomNumbers = new int[6];
            for (int i = 0; i < randomNumbers.length; i++) {
                //Math ist class die es schoon gibt, gleich wie scanner
                int number = (int) (Math.random() * 100); //Math hat double, wir auf int umgewandelt
                //damit immer wieder schauen ob wir neue zufällige Zahl
                //zahlen eingrenzen auf 49, weil in Methode Math bis 99 gespeichert; und random so definiiert, dass keine
                //neg zahlen
                while (number > 49 || number < 1) {
                    number = (int) (Math.random() * 100);
                }
                randomNumbers[i] = number;

            }
            return randomNumbers;
        //kann Klammer leer lassen, oder array schon reingeben, wir daweil nix
    }
}
