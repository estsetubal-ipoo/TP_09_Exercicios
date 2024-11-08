public class Program {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Ana Gomes", "123456789");
        BankAccount account2 = new BankAccount("João Pacheco", "123444555", 200);

        System.out.println(account1);
        System.out.println(account2);

        account1.deposit(100);
        account2.withdraw(50);

        account1.transferTo(account2, 20);

        System.out.println("-------");
        System.out.println(account1);
        System.out.println(account2);

        System.out.println("-------");
        // Podemos invocar/testar os restantes getters, e.g.:
        System.out.printf("Saldo conta %s = %.2f", account1.getAccountNumber(), account1.getBalance());

    }
}
