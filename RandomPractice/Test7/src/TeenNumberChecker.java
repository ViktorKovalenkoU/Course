public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge){

        if(firstAge >= 13 && firstAge <= 19){
            return true;
        } else if (secondAge >= 13 && secondAge <= 19) {
            return true;
        } else if (thirdAge >= 13 && thirdAge <= 19) {
            return true;
        }
        return false;
    }
    public static boolean isTeen (int age){
        if (age >= 13 && age <= 19){
            return true;
        }
        return false;
    }
}