package task3.Bank;

public class Test
{
    public static void main(String[] args)
    {
        Bank bank = new Bank();

        SavingAccount savings1 = new SavingAccount(101, 2.5);
        CheckingAccount checking1 = new CheckingAccount(201);

        savings1.deposit(100000);
        checking1.deposit(50000);
        checking1.withdraw(10000);

        savings1.transfer(20000, checking1);

        bank.openAccount(savings1);
        bank.openAccount(checking1);

        System.out.println("Initially:");
        bank.displayAccounts();

        bank.update();

        System.out.println("After update:");
        bank.displayAccounts();

        bank.closeAccount(101);
        System.out.println("After closing: ");
        bank.displayAccounts();
    }
}