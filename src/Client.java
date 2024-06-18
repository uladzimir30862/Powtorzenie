import java.util.concurrent.atomic.AtomicInteger;

public class Client extends User {
    private static final AtomicInteger idGenerator = new AtomicInteger();
    private final int clientId;
    private BankAccount account;

    public Client(String firstName, String lastName) {
        super(firstName, lastName);
        this.clientId = idGenerator.incrementAndGet();
        this.account = new BankAccount();
    }

    public int getClientId() {
        return clientId;
    }

    public BankAccount getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", account=" + account +
                "} " + super.toString();
    }
}
