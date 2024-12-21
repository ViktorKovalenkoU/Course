public class MethodChallenge {
    public static void main(String[] args) {

        int playersPosition = calculateHighScorePosition(1666);
        displayHighScorePosition("Vic",playersPosition);

        playersPosition = calculateHighScorePosition(1337);
        displayHighScorePosition("Alex",playersPosition);

        playersPosition = calculateHighScorePosition(269);
        displayHighScorePosition("Katerina",playersPosition);

        playersPosition = calculateHighScorePosition(296);
        displayHighScorePosition("Nastya",playersPosition);
    }
    public static void displayHighScorePosition(String playersName, int playersPosition) {
        System.out.println(playersName + " managed to get into position " + playersPosition + " on the high score list;");

    }
    public static int calculateHighScorePosition(int score) {
           if (score >= 1000) {
               return 1;
        }else if(score >= 500){
               return 2;
        }else if(score >= 100){
               return 3;
           }
           return 4;
    }
}