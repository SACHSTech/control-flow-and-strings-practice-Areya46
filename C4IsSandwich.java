class C4lsSandwich extends ConsoleProgram {

    /**
    * Description: This code will return the string that is between the first 
    and last appearance of "bread" in the given string, or output the empty string "" if 
    there are not two pieces of bread.
    * @author: A. E-S
    */
    
    public void run() {
      
      // Variables 
      String strWord;
      int firstBread;
      int secondBread;

      // Input 
      strWord = readLine("");

      // Compute 
      firstBread = strWord.indexOf("bread");
      secondBread = strWord.indexOf("bread", firstBread + 4);

      if (secondBread == -1){
        
      }
      else {
        System.out.println(strWord.substring(firstBread + 5, secondBread));
      }

    }
  }
  