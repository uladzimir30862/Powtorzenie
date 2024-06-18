public interface AccountOperations {
    double getBalance();
    void deposit(double amount) throws AccountOperationException;
    void transfer(BankAccount targetAccount, double amount) throws AccountOperationException;
}
