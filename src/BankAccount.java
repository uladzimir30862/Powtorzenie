import java.util.ArrayList;
import java.util.List;

public class BankAccount implements AccountOperations {
    private double balance;
    private List<Transaction> transactions;

    public BankAccount() {
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) throws AccountOperationException {
        if (amount <= 0) {
            throw new AccountOperationException("Kwota depozytu musi być większa od zera.");
        }
        balance += amount;
        transactions.add(new Transaction(amount, null, this));
    }

    @Override
    public void transfer(BankAccount targetAccount, double amount) throws AccountOperationException {
        if (amount <= 0) {
            throw new AccountOperationException("Kwota przelewu musi być większa od zera.");
        }
        if (amount > this.balance) {
            throw new AccountOperationException("Niewystarczające saldo do przelewu.");
        }
        this.balance -= amount;
        targetAccount.deposit(amount);
        transactions.add(new Transaction(amount, this, targetAccount));
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
