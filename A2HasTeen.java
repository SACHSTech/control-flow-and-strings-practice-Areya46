class A2HasTeen extends ConsoleProgram {

    /**
    * This program will say if a number is "teen" if it is in the range 13..19 inclusive. 
    Given 3 int values via user input, output true if 1 or more of them are teen.
    * @author: A. Emmanuel-Singh
    */
    
    public void run() {
      
        // Variables 
        int intInput1;
        int intInput2;
        int intInput3;

        // User Input
        intInput1 = readInt("");
        intInput2 = readInt("");
        intInput3 = readInt("");

        // Compute

        if (intInput1 >= 13 && intInput1 <= 19 || intInput2 >= 13 && intInput2 <= 19 || intInput3 >= 13 && intInput3 <= 19){
            System.out.println("true");
        }
        else {
            System.out.println("flase");
        }
      
    }
  }
  