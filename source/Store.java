import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private ArrayList<Item> items;
    private Admin admin;
    private ArrayList<Customer> customers;
    private Scanner scanner;

    public Store() {
        this.items = new ArrayList<>();
        this.admin = new Admin("admin", "password", this);
        this.customers = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        // Adding some default customers
        customers.add(new Customer("customer1", "password1", this));
        customers.add(new Customer("customer2", "password2", this));
    }

    public boolean adminLogin(String id, String password) {
        return id.equals(admin.getId()) && password.equals(admin.getPassword());
    }

    public boolean customerLogin(String id, String password) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id) && customer.getPassword().equals(password)) {
                customer.menu();
                return true;
            }
        }
        return false;
    }

    public void adminMenu() {
        admin.menu();
    }

    public void customerMenu() {
        for (Customer customer : customers) {
            customer.menu();
        }
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean modifyItem(String name, int quantity, double cost) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                item.setQuantity(quantity);
                item.setCost(cost);
                return true;
            }
        }
        return false;
    }

    public void viewItems() {
        if (items.isEmpty()) {
            System.out.println("No items available.");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }
}
