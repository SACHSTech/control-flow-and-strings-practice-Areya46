import java.util.Random; 
class B1DiceGame extends ConsoleProgram {

    /**
    * This program lets you simulate the rolling of 100 pairs of dice. For each roll,
        If the pair adds up to 2, print "snake eyes!"
        If the pair adds up to 7, print "lucky seven"
        if the pair adds up to any other sum, do not print out anything
    * @author: Emma Chan + Areya E-S
    */
    
    public void run() {
        Random myRandom = new Random(); 

      for ( int i = 0; i < 100; i++){
        int d1 = myRandom.nextInt(7);
        int d2 = myRandom.nextInt(7);
        if ((d1 + d2) == 2){
            System.out.println("Snake eyes!");
        }
        else if ((d1 + d2) == 7){
            System.out.println("lucky seven");
        }
      }

    }
  }  
