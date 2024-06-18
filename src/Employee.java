import java.util.concurrent.atomic.AtomicInteger;

public class Employee extends User {
    private static final AtomicInteger idGenerator = new AtomicInteger();
    private final int employeeId;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.employeeId = idGenerator.incrementAndGet();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Client addClient(String firstName, String lastName) {
        return new Client(firstName, lastName);
    }

    public void acceptDeposit(BankAccount account, double amount) throws AccountOperationException {
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                "} " + super.toString();
    }
}
