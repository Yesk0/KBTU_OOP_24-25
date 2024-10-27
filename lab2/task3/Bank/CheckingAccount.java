package task3.Bank;

public class CheckingAccount extends Account
{
    private static final int FREE_TRANSACTIONS = 3;
    private static final double transaction_fee = 0.02;
    private int trasactions;

    public CheckingAccount(int accountNumber)
    {
        super(accountNumber);
        this.trasactions = 0;
    }
        
    public void deposit(double sum)
    {
        super.deposit(sum);
        trasactions++;
        deductFee();
    }

    public void withdraw(double sum)
    {
        super.withdraw(sum);
        trasactions++;
        deductFee();
    }

    private void deductFee()
    {
        if (trasactions > FREE_TRANSACTIONS)
        {
            super.withdraw(transaction_fee);
        }
    }

    public String toString()
    {
        return super.toString() + ", Transaction: " + trasactions;
    }
}