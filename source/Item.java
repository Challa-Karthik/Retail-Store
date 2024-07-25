public class Item {
    private String name;
    private String category;
    private int quantity;
    private double cost;

    public Item(String name, String category, int quantity, double cost) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}
