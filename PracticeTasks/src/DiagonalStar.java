public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        String star = "*";
        String space = " ";
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= number; column++) {
                boolean isFirstRowOrColum = row == 1 || column == 1;
                boolean isLastRowOrColum = row == number || column == number;
                boolean isDiagonal = row == column || column == (number - row + 1);
                if (isFirstRowOrColum || isLastRowOrColum || isDiagonal) {
                    System.out.print(star);
                } else {
                    System.out.print(space);
                }
            }
            System.out.println();
        }
    }
}
