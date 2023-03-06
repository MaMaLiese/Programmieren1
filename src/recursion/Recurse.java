package recursion;
//recursion ist methode, die sich immer wieder selbst aufruft
//um die nicht infinite aufzurufen, brauchen wir base case in folgendem Bsp n == 0
//ziel ist runterzählen von nummer die wir definieren und wir wollen in jeder Zeile was ausgeben, brauchen aber keinen
//Rückgabewert, weil er ja nur runterzählt

public class Recurse {
    public static void main(String[] args) {
        doCountdown(-10);

    }
    public static void doCountdown (int n) {
        if (n != 0) {
            n++;
            System.out.println(n);
            doCountdown(n);
        } else {
            System.out.println("Finished!");
        }
    }
}
//wie kann man recursion stoppen: base case
