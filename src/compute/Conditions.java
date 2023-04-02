package compute;

public class Conditions {
    public static void main(String[] args) {
        boolean isSenior = true;
        boolean isDog = false;
        boolean isStudent = false;

        checkIfDiscount(isSenior, isStudent, isDog);
        checkIfDiscount(true, false, true);
        checkIfDiscount(false, false, true);
        checkIfDiscount(false, true, true);
        checkIfDiscount(false, true, true);



//        in a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one fiction book
        int fiction = 1;
        int nonFiction = 2;

       checkIfBooksDiscount();



}
public static void checkIfDiscount (boolean isSenior, boolean isStudent, boolean isDog) {
    if (isSenior) {
        System.out.println("Discount!");
    } else if (isDog) {
        System.out.println("Discount!");
    } else if (isStudent) {
        System.out.println("Discount!");
    } else {
        System.out.println("No Discount!");
    }
}
public static void checkIfBooksDiscount (int fiction, int nonFiction) {
    if (fiction > 0 && nonFiction >= 3) {
        System.out.println("Discount!");
    } else {
        System.out.println("No Discount!");
    }
}
////falls Rückgabewert:
//    public static String checkIfBooksDiscount (int fiction, int nonFiction) {
//        String discount = "Discount!";
//        String noDiscount = "NO discount";
//
//        if (fiction > 0 && nonFiction >= 3) {
//            return discount;
//        } else {
//            return noDiscount;
//        }
    }


}

