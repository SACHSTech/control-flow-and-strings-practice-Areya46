class C2EveryNth extends ConsoleProgram {

    /**
    * Description: Given a non-empty string and an int N, this program will return the string made 
    starting with character 0, and then every Nth char of the string. So if N 
    is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
    * @author: A. E-S
    */
    
    public void run() {
      
        // Declare variables 
        String strUserString;
        int intUserLength;
        int intN;

        // User input 
        strUserString = readLine("Input a string: ");
        intN = readInt("Input an interger: ");

         // Compute 
        intUserLength = strUserString.length();

        for (int count = 0; count < intUserLength; count++){
            if (count % intN == 0){
            System.out.print(strUserString.charAt(count));
            }
        }
      
    }
  }  
