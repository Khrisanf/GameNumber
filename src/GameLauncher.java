import java.util.Random;

public class GameLauncher {
    private static final Random rd = new Random();

    public static void main(String[] args) {
        System.out.println("Welcome in our GUESSgame! So, what's your name?");

        Guests guests = new Guests();
        guests.WhatsYourName();

        int secretNumber = rd.nextInt(10) + 1;
        GuessGame game = new GuessGame();

        boolean gameWon = false;
        while (!gameWon) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(guests.getPlayerName(i) + ", it's your turn to guess the number between 1 and 10.");
                guests.makeGuess();
                gameWon = game.guessResult(secretNumber, guests, i);
                if (gameWon) {
                    break;
                }
            }
        }
    }
}

