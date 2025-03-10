package challenges.challenge1;

class Electronics extends ProductForSale {
    public Electronics(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("Electronics: %s | Price: %.2f | Description %s%n", getType(), getPrice(), getDescription());
    }
}