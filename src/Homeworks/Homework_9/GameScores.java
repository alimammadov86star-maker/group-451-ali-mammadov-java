package Homeworks.Homework_9;

public class GameScores {

    public static void main(String[] args) {

        int[] scores = {120, 85, 200, 95, 150, 60, 175, 110};

        int bestScore = scores[0];
        int worstScore = scores[0];

        for (int i = 1; i < scores.length; i++) {

            bestScore = Math.max(bestScore, scores[i]);
            worstScore = Math.min(worstScore, scores[i]);
        }

        System.out.println("Best result: " + bestScore);
        System.out.println("Worst result: " + worstScore);

        int difference = bestScore - worstScore;

        System.out.println("Difference between best and worst: " + difference + " points");

        if (difference > 100) {
            System.out.println("Very big difference!");
        }
    }
}
