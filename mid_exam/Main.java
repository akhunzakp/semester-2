package mid_exam;

public class Main {
    public static void main(String[] args) {
        // Create the account manager
        AccountManager accountManager = new AccountManager();

        // Load the provided data into the account manager
        accountManager.addAccount(new Account(16030927, "Wallace", "3084", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu", 10000));
        accountManager.addAccount(new Account(16100617, "Darius", "0573", "1-357-843-0547", "nec@lectusjusto.org", 7000));
        accountManager.addAccount(new Account(16240401, "Fuller", "2243", "571-7062", "convallis@Vestibulumanteipsum.org", 5000));
        accountManager.addAccount(new Account(16270525, "Malcolm", "0112", "623-0234", "porttitor.tellus.non@Curabitur.ca", 44000));
        accountManager.addAccount(new Account(16971204, "Geoffrey", "2416", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com", 50000));
        accountManager.addAccount(new Account(16100727, "Rudyard", "8862", "650-5379", "Proin.eget@velitegestaslacinia.ca", 123000));
        accountManager.addAccount(new Account(16460329, "Troy", "4259", "897-7608", "pede.Suspendisse.dui@a.ca", 100000));
        accountManager.addAccount(new Account(16320421, "Alec", "3437", "792-4447", "non@mus.com", 34000));
        accountManager.addAccount(new Account(16180729, "Walter", "7229", "863-8209", "Pellentesque.ut.ipsum@neque.ca", 334544));
        accountManager.addAccount(new Account(16950313, "Simon", "6823", "592-6919", "tellus.justo.sit@commodoauctor.net", 23444));
        accountManager.addAccount(new Account(16850708, "Kamal", "3528", "1-115-339-7678", "dictum@nec.edu", 567770));

        // Display all accounts
        System.out.println("\nAll accounts:");
        accountManager.displayAllAccounts();

        // Sort accounts by balance in descending order
        System.out.println("\nSorting accounts by balance:");
        accountManager.sortAccountsByBalance();

        // Display accounts with zero balance
        System.out.println("\nDisplaying accounts with zero balance:");
        accountManager.displayZeroBalanceAccounts();

        // Search accounts by name keyword
        String nameKeyword = "Simon";
        System.out.println("\nSearching for accounts with name keyword '" + nameKeyword + "':");
        accountManager.searchAccountByName(nameKeyword);

        // Perform withdrawal from an account
        long accountNumberToWithdraw = 16180729;
        double withdrawAmount = 10000;
        System.out.println("\nWithdrawing " + withdrawAmount + " from account number " + accountNumberToWithdraw + ":");
        accountManager.withdraw(accountNumberToWithdraw, withdrawAmount);

        // Perform deposit into an account
        long accountNumberToDeposit = 16180729;
        double depositAmount = 5000;
        System.out.println("\nDepositing " + depositAmount + " into account number " + accountNumberToDeposit + ":");
        accountManager.deposit(accountNumberToDeposit, depositAmount);
    }
}