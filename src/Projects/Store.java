package Projects;

import java.util.ArrayList;

class OrderRecord {
    String customerName;
    String productName;
    int quantity;

    public OrderRecord(String customerName, String productName, int quantity) {
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
    }
}

public class Store {
    private ArrayList<OrderRecord> orders;

    public Store() {
        orders = new ArrayList<OrderRecord>();
    }

    public void placeOrder(String customerName, String productName, int quantity) {
        orders.add(new OrderRecord(customerName, productName, quantity));
    }

    public void cancelOrder(String customerName, String productName) {
        for (int i = 0; i < orders.size(); i ++){
            if (orders.get(i).customerName.equals(customerName) && orders.get(i).productName.equals(productName)){
                orders.remove(i);
                return;
            }
        }
    }

    public int totalQuantityOrdered(String productName) {
        int count = 0;
        for (int i = 0; i < orders.size(); i ++){
            if (orders.get(i).productName.equals(productName)){
                count ++;
            }
        }
        return count;
    }

    public boolean hasOrdered(String customerName, String productName) {
        for (int i = 0; i < orders.size(); i++){
            if (orders.get(i).customerName.equals(customerName) && orders.get(i).productName.equals(productName)) return true;
        }
        return false;
    }

    public int countOrdersByCustomer(String customerName) {
        int count = 0;
        for (int i = 0; i < orders.size(); i ++){
            if (orders.get(i).customerName.equals(customerName)){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Store store = new Store();

        // Example tests you can run:
         store.placeOrder("Alice", "Laptop", 1);
         store.placeOrder("Bob", "Mouse", 2);
         store.placeOrder("Alice", "Mouse", 1);
         System.out.println(store.totalQuantityOrdered("Mouse"));
         System.out.println(store.hasOrdered("Alice", "Laptop"));
         store.cancelOrder("Bob", "Mouse");
         System.out.println(store.hasOrdered("Bob", "Mouse"));
         System.out.println(store.countOrdersByCustomer("Alice"));
    }
}
