package task3.Bank;

import java.util.Vector;

public class Bank
{
    private Vector<Account> accounts;

    public Bank()
    {
        accounts = new Vector<>();
    }

    public void openAccount(Account account)
    {
        accounts.add(account);
    }

    public void closeAccount(int accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber() == accountNumber);
    }

    public void update()
    {
        for (Account account : accounts)
        {
            if (account instanceof SavingAccount)
            {
                ((SavingAccount) account).addInterest();
            }
            else if (account instanceof CheckingAccount)
            {}
        }
    }

    public void displayAccounts()
    {
        for (Account account : accounts)
        {
            account.print();
        }
    }
}