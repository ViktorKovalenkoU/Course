package oop.practice13;


public class CompositionChallenge {
    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();

        smartKitchen.setKitchenState(true, true, true);
        smartKitchen.doKitchenWork();

    }
}

