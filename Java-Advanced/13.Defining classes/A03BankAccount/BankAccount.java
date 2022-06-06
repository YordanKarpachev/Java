package DefiningClasses.A03;

public class BankAccount {


    private final static double DEFAULT_INTEREST_RATE = 0.02;

    public static double interesetRate = DEFAULT_INTEREST_RATE;
    private static int bankAccount = 1;
    private double balance;
    private int id ;

    public static void setInteresetRate(double interesetRate) {
        BankAccount.interesetRate = interesetRate;
    }

    void deposit(double deposit) {
        this.balance += deposit;
    }

    public double getInteresetRate(int years) {
        return BankAccount.interesetRate * years * this.balance;
    }

    public BankAccount(){
        this.id = bankAccount++;
    }

    public int getId() {
        return id;
    }
}
