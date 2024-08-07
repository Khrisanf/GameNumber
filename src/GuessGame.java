public class GuessGame {
    public boolean guessResult(int secretNumber, Guests guests, int currentPlayer) {
        int compare = guests.getGuessNum();
        String playerName = guests.getPlayerName(currentPlayer);


        switch (currentPlayer) {
            case 1:
                playerName = guests.getPlayer1();
                break;
            case 2:
                playerName = guests.getPlayer2();
                break;
            case 3:
                playerName = guests.getPlayer3();
                break;
            default:
                playerName = "Unknown Player";
                break;
        }

        if (secretNumber == compare) {
            System.out.println(playerName + " wins!");
            return true;
        } else {
            System.out.println("Sorry, " + playerName + ", that's not the right number. Next!");
        return false;
        }
    }
}
