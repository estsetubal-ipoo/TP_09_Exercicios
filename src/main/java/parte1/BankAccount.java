package parte1;

public class BankAccount {

    public static final String BANK_CODE = "ESTS";
    private static int accountCounter = 0;

    private String accountNumber;
    private String clientName;
    private String clientNIF;
    private double balance;

    public BankAccount(String clientName, String clientNIF) {
        this(clientName, clientNIF, 0);
    }

    public BankAccount(String clientName, String clientNIF, double initialBalance) {
        if(initialBalance < 0) {
            throw new IllegalArgumentException("initial balance cannot be negative.");
        }

        this.clientName = clientName;
        this.clientNIF = clientNIF;
        balance = initialBalance;

        accountCounter++;
        accountNumber = String.format("%s-%05d", BANK_CODE, accountCounter);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be <= 0.");
        }

        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be <= 0.");
        }

        balance -= amount;
    }

    /**
     * Transfers an amount of money to another account.
     * @param dest the receiving bank account
     * @param amount the amount to transfer
     * @return true, if the operation is successful; false, otherwise
     */
    public boolean transferTo(BankAccount dest, double amount) {
        if(balance < amount) return false; // não há saldo suficiente

        withdraw(amount);
        dest.deposit(amount);

        return true;
    }


    public String getClientName() {
        return clientName;
    }

    public String getClientNIF() {
        return clientNIF;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return String.format("AccountNumber = %s, Client Name = %s, Client NIF = %s, Balance = %.2f€",
                accountNumber, clientName, clientNIF, balance);
    }

}
