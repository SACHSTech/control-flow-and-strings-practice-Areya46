import java.util.Random;
class B2GuessingGame extends ConsoleProgram {


    /**
    * Write a program GuessingGAME that lets the computer generate a secret number
    (an integer between 1 and 100, for your friend to guess. If they guess too high,
    print: "too high, guess again." If they guess too low, print: "too low, guess again".
    If they guess the number, let the program stop and print "congratulations". If
    they've guessed incorrectly after 5 attempts, print "Nice Try"
    * @author: Emma Chan and Areya ES
    */
   
    public void run() {
        Random myRandom = new Random();
        
        // generate secret number
        int Random = myRandom.nextInt(101);

        // user imput
        int guess = readInt(" Enter your guess: ");

        // outputs
        while (true){
        if (guess > Random){
            System.out.println("Too high, guess again");
            guess = readInt("Guess again: ");
            if (guess > Random){
                System.out.println("Too high, guess again");
            }
            else if (guess < Random){
                System.out.println("Too low, guess again");
                guess = readInt("Try again: ");
            }
            else if (guess == Random) {
                System.out.println("Congradulations!");
                break;
            }
        }
    }
    }
}