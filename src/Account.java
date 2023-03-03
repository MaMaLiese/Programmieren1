public class Account {
    public static void main(String[] args) {
      int years = 10;
        double investment = 2000;
       //double interestRate = 0.025;
        double interestRate = 102.5;
        double accountBalance = calculateAccountBalance(years, investment, interestRate);

        System.out.println(accountBalance);


    }
    public static double calculateAccountBalance(int years, double investment, double interestRate) {
        double accountBalance = investment;
        //for loop soll für jedes jahr unsere account balance berechnen
        for (int i = 1; i <= years; i++) {
            //accountBalance = accountBalance + accountBalance * interestRate;
            accountBalance = accountBalance / 100 * interestRate;
            System.out.println(accountBalance + "Euros in year " + i);
        }
        return accountBalance;
    }
}
