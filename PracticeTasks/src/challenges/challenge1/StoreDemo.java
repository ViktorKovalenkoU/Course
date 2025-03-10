package challenges.challenge1;

public class StoreDemo {
    public static void main(String[] args) {
        Store store = new Store();

        store.addProduct(new Electronics("TV", 499.99, "55-inch 4K OLED TV"));
        store.addProduct(new Furniture("Sofa", 899.99, "Comfortable 3-seater leather sofa"));

        store.showProducts();

        store.addToOrder(new Electronics("TV", 499.99, "55-inch 4K OLED TV"), 2);
        store.addToOrder(new Furniture("Sofa", 899.99, "Comfortable 3-seater leather sofa"), 1);

        store.printOrder();
    }
}
