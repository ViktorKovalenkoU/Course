package oop.practice15;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void driveCar() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println("It`s a" + instanceType +
                " and it has the following characteristics:");
    }

    public static Car getCar(String type, String description) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'G' -> new GasPoweredCar(type);
            case 'E' -> new ElectricCar(type);
            case 'H' -> new HybridCar(type);
            default -> new Car(description);
        };
    }
}

class GasPoweredCar extends Car {
    public GasPoweredCar(String description) {
        super(description);
    }

    @Override
    public void driveCar() {
        super.driveCar();
        System.out.printf("..%s%n".repeat(3),
                "Internal combustion engine",
                "Expensive fuel",
                "Loud engine");
    }
}

class ElectricCar extends Car {
    public ElectricCar(String description) {
        super(description);
    }

    @Override
    public void driveCar() {
        super.driveCar();
        System.out.printf("..%s%n".repeat(3),
                "Electric motor",
                "Economical",
                "Quite engine");
    }
}

class HybridCar extends Car {
    public HybridCar(String description) {
        super(description);
    }

    @Override
    public void driveCar() {
        super.driveCar();
        System.out.printf("..%s%n".repeat(3),
                "Internal combustion engine and electric motor",
                "Economical",
                "Loud engine");
    }
}
