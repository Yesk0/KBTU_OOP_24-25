package task3.Bank;

public class Account
{
    private double balance;
    private int accountNumber;

    public Account(int accountNumber)   {
        this.balance = 0.0;
        this.accountNumber = accountNumber;
    }

    public void deposit(double sum)    {
        if (sum > 0)
        {
            balance += sum;
        }
        else
        {
            System.out.println("Deposit is should be positive");
        }
    }

    public void withdraw(double sum)    {
        if (sum > 0 && sum <= balance)
        {
            balance -= sum;
        }
        else
        {
            System.out.println("Insuffisient balance or negative value");
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void transfer(double amount, Account other)    {
        if (amount > 0 && amount <= balance)
        {
            withdraw(amount);
            other.deposit(amount);
        }
        else
        {
            System.out.println("Transfer is failed");
        }
    }

    public String toString()
    {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }

    public final void print()
    {
        System.out.println(toString());
    }
}