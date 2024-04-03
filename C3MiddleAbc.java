class C3MiddleAbc extends ConsoleProgram {

    /**
    * Description: Given a string, does "abc" appear in the middle of the string? 
    To define middle, we'll say that the number of characters to the left and right 
    of the "abc" must differ by at most one.
    * @author: A. E-S
    */
    
    public void run() {
      
        // Variables
        String strWord;
        int countA;
        int countB;

        // User Input
        strWord = readLine("");

        // Compute 
        countA = strWord.indexOf("a");
        countB = strWord.length() - strWord.indexOf("c");

        if (countA - countB == 1 || countB - countA == 1 || countA - countB == 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

      
    }
  }
  