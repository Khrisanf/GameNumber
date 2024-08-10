public class GuessGame {
    public boolean guessResult(int secretNumber, int guessNum, Guest guest) {
        if (secretNumber != guessNum) {
            System.out.println("Sorry, " + guest.getName() + ", that's not the right number. Next!");
            return false;
        }

        System.out.println(guest.getName() + " wins!");
        return true;
    }
}


// secretNumber, NumburOfGuest