package temp;

public class Temp {
    public static void main(String[] args) {
        int[] newArray;
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        for (int element : newArray) {
            System.out.print(element + " ");
        }
    }


}
