public class Main {
    public static void main(String[] args) {
        char charNatoValue = 'D';

        switch (charNatoValue){
            case 'A':
                System.out.println("A = Able");
                break;
            case 'B':
                System.out.println("B = Baker");
                break;
            case 'C':
               System.out.println("C = Charlie");
               break;
            case 'D':
                System.out.println("D = Dog");
                break;
            case 'E':
                System.out.println("E = Easy");
                break;
            default:
                System.out.println("not found");
        }
    }
}