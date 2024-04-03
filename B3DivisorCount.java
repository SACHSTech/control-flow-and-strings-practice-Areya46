class B3DivisorCount extends ConsoleProgram {

    /**
    * Description: This program lets you enter an integer and that prints all the divisors of that
    number. Note that d is a divisor of n if n%d=0
    * @author: A. E-S
    */
    
    public void run() {
     
        // Variables 
        int intNumber;

        // User input 
        intNumber = readInt("");

        // Compute + Output
        for (int divider = 1; divider <= intNumber; divider++){
            //System.out.print("the divider used is: " + divider);   
            if (intNumber % divider == 0){
                    System.out.println(divider);
            }
        }

    }
}
  