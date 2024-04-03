class A3Within10 extends ConsoleProgram {

    /**
    * Once given 2 int values via user input, this program will output whichever 
    value is nearest to the value 10, or output 0 in the event of a tie. 
    Note that Math.abs(n) returns the absolute value of a number.
    * @author: A. E-S
    */
    
    public void run() {
      
        // Variables 
        int int1;
        int int2;
        int remainder1;
        int remainder2;

        // Input
        int1 = readInt("");
        int2 = readInt("");

        // Compute
        Math.abs(int1);
        Math.abs(int2);

        remainder1 = Math.abs(10 - int1);
        remainder2 = Math.abs(10 - int2);

        if (remainder1 > remainder2){
            System.out.println(int2);
        }
        else if (remainder1 == remainder2)
            System.out.println("0");
        else {
            System.out.println(int1);
        }
      
    }
  }
  