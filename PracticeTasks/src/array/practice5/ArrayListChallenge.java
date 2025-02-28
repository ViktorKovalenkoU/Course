package array.practice5;

import java.util.*;

public class ArrayListChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> groceryList = new ArrayList<>();
        String textBlock = """
                |Available actions|
                0 - to shutdown
                1 - to add item(s) to list 
                2 - to remove any items""";
        System.out.println(textBlock);
        System.out.println("How many different groceries you need?");
        int len = 0;

        while (true) {
            try {
                len = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter an integer.");
                sc.next();
            }
        }

        while (len != 0) {
            int action = 0;
            while (true) {
                try {
                    System.out.println("|Select an action|");
                    action = sc.nextInt();
                    sc.nextLine();
                    if (action != 0 && action != 1 && action != 2) {
                        System.out.println("Unsupported value, try again.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input, please enter an integer.");
                    sc.next();
                }
            }

            if (action == 0) {
                break;
            }
            if (action == 1) {
                System.out.println("Enter your groceries: ");
                String add = sc.nextLine();
                if (groceryList.contains(add)) {
                    System.out.println("Duplicate found, enter another groceries: " + add);
                } else {
                    groceryList.add(add);
                    len--;
                }
            }
            if (action == 2) {
                System.out.println("Which groceries you want to remove: ");
                String re = sc.nextLine();
                groceryList.remove(re);
            }
        }
        groceryList.sort(Comparator.naturalOrder());
        System.out.println(groceryList);
    }
}
