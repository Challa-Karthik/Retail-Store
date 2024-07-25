import java.util.Scanner;

public class Admin extends User {
    private Store store;
    private Scanner scanner;

    public Admin(String id, String password, Store store) {
        super(id, password);
        this.store = store;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void menu() {
        while (true) {
            System.out.println("Admin Menu");
            System.out.println("1. Add Item");
            System.out.println("2. Modify Item");
            System.out.println("3. View Items");
            System.out.println("4. Logout");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addItem();
                    break;
                case 2:
                    modifyItem();
                    break;
                case 3:
                    store.viewItems();
                    break;
                case 4:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }

    private void addItem() {
        System.out.print("Enter Item Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Category: ");
        String category = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter Cost: ");
        double cost = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        store.addItem(new Item(name, category, quantity, cost));
        System.out.println("Item added successfully.");
    }

    private void modifyItem() {
        System.out.print("Enter Item Name to Modify: ");
        String name = scanner.nextLine();
        System.out.print("Enter New Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter New Cost: ");
        double cost = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        if (store.modifyItem(name, quantity, cost)) {
            System.out.println("Item modified successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }
}
