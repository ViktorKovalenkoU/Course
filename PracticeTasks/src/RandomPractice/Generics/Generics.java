package RandomPractice.Generics;

public class Generics {
    public static void main(String[] args) {
        GenericsPractice<Car, String> example = new GenericsPractice<>();

        String vString = " reliable.";

        Car car1 = new Car("Toyota", 2025);
        Car car2 = new Car("Volvo", 2015);
        Car car3 = new Car("BMW", 2020);

        example.addToString(car1, vString);
        example.addToString(car2, vString);
        example.addToString(car3, vString);

        System.out.println(example.getString());
    }
}
