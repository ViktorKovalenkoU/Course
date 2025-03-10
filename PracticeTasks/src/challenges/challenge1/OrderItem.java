package challenges.challenge1;

class OrderItem {
    private ProductForSale product;
    private int quantity;

    public OrderItem(ProductForSale product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getSalesPrice(quantity);
    }

    public void printOrderItemDetails() {
        product.printPricedItem(quantity);
    }
}
