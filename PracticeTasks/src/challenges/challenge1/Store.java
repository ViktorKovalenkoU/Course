package challenges.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<ProductForSale> productList = new ArrayList<>();
    private List<OrderItem> order = new ArrayList<>();


    public void addProduct(ProductForSale product) {
        productList.add(product);
    }

    public void showProducts() {
        System.out.println("Available Products:");
        for (ProductForSale product : productList) {
            product.showDetails();
        }
    }

    public void addToOrder(ProductForSale product, int quantity) {
        order.add(new OrderItem(product, quantity));
    }

    public void printOrder() {
        System.out.println("Order Details:");
        for (OrderItem item : order) {
            item.printOrderItemDetails();
        }
    }
}

