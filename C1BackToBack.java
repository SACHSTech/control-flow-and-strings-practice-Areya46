class C1BackToBack extends ConsoleProgram {

    /**
    * Description: Once given a string, this code will take the last character 
    and print a new string with the last character added at the front and back, 
    so "cat" yields "tcatt". The original string will be length 1 or more.
    * @author: A. E-S
    */
    
    public void run() {
      
        //Declare variables 
        String word;

        // Input form user 
        word = readLine("");
        word.length();
        System.out.printf("%s" + word + "%s", word.substring(word.length() - 1), word.substring(word.length() - 1));
      
    }
  }
  
