import java.util.Random;
import java.util.Scanner;

public class GameLauncher {
    private static       Scanner sc = new Scanner(System.in); 
    private static final Random  rd = new Random();

    public static Guest[] setupGuest(int countPlayer) {
        Guest[] guests = new Guest[countPlayer];

        for (int i = 0; i < countPlayer; ++i) {
            System.out.println("Enter name for Player " + Integer.toString(i + 1) + ":");
            String name = sc.nextLine();
            guests[i] = new Guest(name);
        }

        return guests;
    }

    public static void main(String[] args) {
        System.out.println("Welcome in our GUESSgame! So, what's your name?");

        int       countGuest = 3;
        Guest[]   guests = setupGuest(countGuest);
        GuessGame game   = new GuessGame();
        
        int secretNumber = rd.nextInt(10) + 1;

        boolean gameWon = false;
        while (!gameWon) {
            for (int i = 0; i < countGuest; ++i) {
                System.out.println(guests[i].getName() + ", it's your turn to guess the number between 1 and 10.");
                System.out.println("Enter your number:");
                
                int guessNum = sc.nextInt();

                gameWon = game.guessResult(secretNumber, guessNum, guests[i]);
                if (gameWon) {
                    break;
                }
            }
        }
    }
}

