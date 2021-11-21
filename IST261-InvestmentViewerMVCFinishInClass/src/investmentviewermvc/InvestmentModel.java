package investmentviewermvc;

/**
 * Based on program in Big Java: Late Objects by Cay Horstmann; modified
 */
public class InvestmentModel {

    private static final double DEFAULT_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;

    private double balance;

    public InvestmentModel() {
        this.balance = INITIAL_BALANCE;
    }

    double addInterest(double interest) {
        balance = balance * (1 + (interest/100));
        return balance;
    }
    
    // just getters below

    /**
     * @return the DEFAULT_RATE
     */
    public static double getDEFAULT_RATE() {
        return DEFAULT_RATE;
    }

    /**
     * @return the INITIAL_BALANCE
     */
    public static double getINITIAL_BALANCE() {
        return INITIAL_BALANCE;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

}
