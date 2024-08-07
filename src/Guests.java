import java.util.Scanner;

public class Guests {
    private String Player1;
    private String Player2;
    private String Player3;
    private int guessNum;
    private Scanner sc;

    public String getPlayerName(int playerNumber) {
        if (playerNumber == 1) return getPlayer1();
        else if (playerNumber == 2) return getPlayer2();
        else if (playerNumber == 3) return getPlayer3();
        else return null;
    }

    public Guests() {
        this.sc = new Scanner(System.in);
    }

    public void WhatsYourName() {
        System.out.println("Enter name for Player 1:");
        Player1 = sc.nextLine();
        System.out.println("Enter name for Player 2:");
        Player2 = sc.nextLine();
        System.out.println("Enter name for Player 3:");
        Player3 = sc.nextLine();
    }

    public void makeGuess() {
        System.out.println("Enter your number:");
        this.guessNum = sc.nextInt();
    }

    public String getPlayer1() {
        return Player1;
    }

    public String getPlayer2() {
        return Player2;
    }

    public String getPlayer3() {
        return Player3;
    }

    public int getGuessNum() {
        return guessNum;
    }

    public void closeScanner() {
        sc.close();
    }
}
