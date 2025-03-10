package challenges.challenge1;

class Furniture extends ProductForSale {
    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("Furniture: %s | Price: %.2f | Description: %s%n", getType(), getPrice(), getDescription());
    }
}
