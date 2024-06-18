public class Main {
    public static void main(String[] args) {
        try {
            Admin admin = new Admin("AdminFirstName", "AdminLastName");

            admin.addEmployee("Employee1FirstName", "Employee1LastName");
            admin.addEmployee("Employee2FirstName", "Employee2LastName");

            Client client1 = admin.addClient("Client1FirstName", "Client1LastName");
            Client client2 = admin.addClient("Client2FirstName", "Client2LastName");
            Client client3 = admin.addClient("Client3FirstName", "Client3LastName");
            Client client4 = admin.addClient("Client4FirstName", "Client4LastName");

            admin.acceptDeposit(client1.getAccount(), 1000);
            admin.acceptDeposit(client2.getAccount(), 2000);
            admin.acceptDeposit(client3.getAccount(), 1500);
            admin.acceptDeposit(client4.getAccount(), 2500);

            client1.getAccount().transfer(client2.getAccount(), 100);
            client2.getAccount().transfer(client3.getAccount(), 200);
            client3.getAccount().transfer(client4.getAccount(), 300);
            client4.getAccount().transfer(client1.getAccount(), 400);
            client1.getAccount().transfer(client3.getAccount(), 50);
            client3.getAccount().transfer(client2.getAccount(), 75);
            client2.getAccount().transfer(client4.getAccount(), 125);
            client4.getAccount().transfer(client3.getAccount(), 60);
            client3.getAccount().transfer(client1.getAccount(), 90);
            client1.getAccount().transfer(client2.getAccount(), 110);

            System.out.println("Client 1 balance: " + client1.getAccount().getBalance());
            System.out.println("Client 2 balance: " + client2.getAccount().getBalance());
            System.out.println("Client 3 balance: " + client3.getAccount().getBalance());
            System.out.println("Client 4 balance: " + client4.getAccount().getBalance());

        } catch (AccountOperationException e) {
            System.out.println("Operation failed: " + e.getMessage());
        }
    }
}
