public class MainChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

       int highScore = calculateScore(true,score,levelCompleted,bonus);
        System.out.println("The highScore is " + highScore);

       score = 10000;
       levelCompleted = 8;
       bonus = 200;

        System.out.println("The next highScore is " +
       calculateScore(true,score,levelCompleted,bonus));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}