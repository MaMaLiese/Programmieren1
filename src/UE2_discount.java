public class UE2_discount {
    public static void main(String[] args) {
        //discount bus
        // senior -15%
        // dog -20%
        // student -10 %
        //full price 3.2
        // senior + dog + grandson *2 bus

        //books
        //-10% > 2nonfiction + >= 1 fiction
        // 2 fiction : 15 + 18
        //2 nonfiction: 23 + 28

        //Aufgabe wieviel sie sparen können kann man ganz zum schluss machen

        boolean isSenior = true; // wissen wir, dass true
        boolean isDog = true;
        boolean isStudent = true; // wissen wir nicht, wird angenommen

        double fullBusPrice = 3.2; //fullPrice ist dasselbe wie fullBusPrice

        double busTicketEdna = getBusDiscountPrice(fullBusPrice, true, false, false);
        double busTicketLola = getBusDiscountPrice(fullBusPrice, false, true, false);
        double busPricePaul = getBusDiscountPrice(fullBusPrice, false, false, true);

        double totalBusPriceDiscounted = 2 * (busPricePaul + busTicketEdna + busTicketLola);
        double totalBusPriceNoDiscount = 6 * 3.2;
        //wäre es gute idee eine Methode zu schreiben? welche, und was sollen wir zurückbekommen
        //was wollen wir wissen:

        int fiction = 2;
        int nonFiction = 2;
        double fullBookPriceNoDiscount = 15 + 18 + 23 + 28;

        double  totalBookPriceDiscounted = getBookDiscountPrice(fullBookPriceNoDiscount, fiction, nonFiction);
        //ab hier haben wir mal alle Teile, die wir brauchen um Frage zu beantworten wievile sie sparen
        double totalSavedMoney = (totalBusPriceNoDiscount + fullBookPriceNoDiscount) - (totalBusPriceDiscounted + totalBookPriceDiscounted);

        System.out.println("Edna, Lola and Paul saved a total of " + totalSavedMoney);
    }
    //zum schluss wollen wir wissen, wieviel wir sparen können
    //zurückbekommen wollen wir einen double, genauer wollen wir wissen wieviel wir tatsächlich bezahlen
    //um diese Frage zu beantworten müssen wir überlegen welche Teile wir brauchen
    //für endfrage brauchen wir keine Methode, das geht mit + / -
    //wieviel müssen wir tatsächlich bezahlen? Frage für erste Methode. zurückbekommen wollen wir discountPrice

    public static double getBusDiscountPrice (double fullPrice, boolean isSenior, boolean isDog, boolean isStudent ) {
        double discountedPrice;
        if (isSenior) {
            discountedPrice = fullPrice * 0.85;
        } else if (isDog) {
            discountedPrice = fullPrice * 0.8;
        } else if (isStudent) {
            discountedPrice = fullPrice * 0.9;
        } else {
            discountedPrice = fullPrice;
        }
        return discountedPrice;
        //in jedem else müssen wir schaun, dass sich discountedPrice auch wirklich verändert;
        //deshalb mach ichs nicht mit system.out.println
        //wenn dann

    }
    //methode für Bücher
    public static double getBookDiscountPrice(double fullBookPrice, int fiction, int nonFiction) {
        double discountedBookPrice;
        if (fiction >= 1 && nonFiction > 2) {
            discountedBookPrice = fullBookPrice * 0.9;
        } else {
            discountedBookPrice = fullBookPrice;
        }
        return discountedBookPrice;
    }
}
