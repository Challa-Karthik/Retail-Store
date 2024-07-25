import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();

        while (true) {
            System.out.println("Welcome to Online Retail Store");
            System.out.println("1. Admin Login");
            System.out.println("2. Customer Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter Admin ID: ");
                    String adminID = scanner.nextLine();
                    System.out.print("Enter Admin Password: ");
                    String adminPassword = scanner.nextLine();
                    if (store.adminLogin(adminID, adminPassword)) {
                        store.adminMenu();
                    } else {
                        System.out.println("Invalid Admin Credentials");
                    }
                    break;
                case 2:
                    System.out.print("Enter Customer ID: ");
                    String customerID = scanner.nextLine();
                    System.out.print("Enter Customer Password: ");
                    String customerPassword = scanner.nextLine();
                    if (store.customerLogin(customerID, customerPassword)) {
                        store.customerMenu();
                    } else {
                        System.out.println("Invalid Customer Credentials");
                    }
                    break;
                case 3:
                    System.out.println("Thank you for visiting!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}
