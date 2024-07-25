public class Customer extends User {
    private Store store;

    public Customer(String id, String password, Store store) {
        super(id, password);
        this.store = store;
    }

    @Override
    public void menu() {
        while (true) {
            System.out.println("Customer Menu");
            System.out.println("1. View Items");
            System.out.println("2. Logout");
            System.out.print("Choose an option: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    store.viewItems();
                    break;
                case 2:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}
