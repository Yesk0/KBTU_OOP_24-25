package task3.Bank;

public class SavingAccount extends Account
{
    private double interestRate;

    public SavingAccount(int accountNumber, double interestRate)    {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public SavingAccount(int accountNumber)    {
        super(accountNumber);
        this.interestRate = 10.0;
    }

    public void addInterest()
    {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }

    public String toString()
    {
        return super.toString() + ", Interest Rate: " + interestRate + "%";
    }
}