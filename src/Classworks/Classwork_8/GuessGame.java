package Classworks.Classwork_8;

public class GuessGame {
    int secretNumber;
    int attemptsLeft;
    boolean gameOver;

    public GuessGame(int min, int max, int maxAttempts) {
        this.secretNumber = (int)(Math.random() * (max - min + 1)) + min;
        this.attemptsLeft = maxAttempts;
        this.gameOver = false;
    }

    public boolean makeGuess(int guess) {
        if (gameOver) return false;

        attemptsLeft--;

        if (guess == secretNumber) {
            gameOver = true;
            return true;
        }

        if (attemptsLeft <= 0) {
            gameOver = true;
        }

        return false;
    }

    public String getHint(int guess) {
        if (guess < secretNumber) return "больше";
        if (guess > secretNumber) return "меньше";
        return "угадал";
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }
}