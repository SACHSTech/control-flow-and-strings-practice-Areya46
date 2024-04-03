class A1FreezingHot extends ConsoleProgram {

  /**
  * Given two temperatures via user input, output true if one is less than 0 
  and the other is greater than 100.
  * @author: Emma Chan  & Areya E-S
  */
  
  public void run() {
    
    // Variables
    int temp1; 
    int temp2; 

    // User Input
    temp1 = readInt("Tempurature 1: "); 
    temp2 = readInt ("Tempurature 2: "); 

      if ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)){
          System.out.println("True");
      } 
      else {
          System.out.println("False");
      }
    
    
  }
}
