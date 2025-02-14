package oop.practice15;

import java.util.List;
import java.util.Scanner;

public class PolymorphismChallenge {
    public static void main(String[] args) {

        AnotherCarClass car = new AnotherCarClass(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());




//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("Enter Type (G for Gas powered car, E for Electric car, " +
//                    "H for Hybrid car, or Q to quit): ");
//            String type = sc.nextLine();
//            if("Qq".contains(type)){
//                break;
//            }
//            System.out.println("Enter your car: ");
//            String description = sc.nextLine();
//            Car car = Car.getCar(type,description);
//            car.driveCar();
    }
}
