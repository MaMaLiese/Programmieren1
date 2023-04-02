public class Flug {

    //wenn man was zählen will ist for-schleife besser, also wenn zählervariable
    //while schleife bietet sich an, wenn man nicht genau weiß wann etwas zu ende ist
    //für kurzformen merken = steht immer rechts...also += gibts nicht

    public static void main(String[] args) {
        boolean notTypA = true;

        for (int i = 1; i <= 50; i++) {
            if (i == 13 || i == 17) {
                continue;
            }

            System.out.println("Reihe " + i);


            if (notTypA && i == 19) {
                break;
            }
        }
    }

    }
