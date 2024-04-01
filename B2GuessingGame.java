import java.util.Random;
class B2GuessingGame extends ConsoleProgram {


    /**
    * Write a program GuessingGAME that lets the computer generate a secret number
    (an integer between 1 and 100, for your friend to guess. If they guess too high,
    print: "too high, guess again." If they guess too low, print: "too low, guess again".
    If they guess the number, let the program stop and print "congratulations". If
    they've guessed incorrectly after 5 attempts, print "Nice Try"
    * @author: Areya ES
    */
   
    public void run() {
        Random myRandom = new Random();
        
        // generate secret number
        int Random = myRandom.nextInt(101);

        // user imput
        int guess = readInt("Enter your guess: "); //guess 1

        // outputs
        int counter = 0;
        // System.out.println("The random number is " + Random); // Test feature 
        
        while (counter < 4){ //guess 2 thru 5
            
            if (guess > Random){
            guess = readInt("Too high, guess again. ");
            }
            else if (guess < Random){
                guess = readInt("Too low, guess again. ");
            }
            else if (guess == Random) {
                System.out.println("Congradulations!");
                break;
            } 
        counter++;
    }
    if (counter == 4){
    System.out.println("Nice Try");
    }

    }
}