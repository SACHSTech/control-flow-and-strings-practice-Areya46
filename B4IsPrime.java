class B4lsPrime extends ConsoleProgram {

    /**
    * Description: This program  lets you enter an integer, and that will print appropriately "is a
    prime number" or "is a composite number". A number n is a prime number, if it
    has no divisors d, where or more conveniently, where 
    * @author:A. E-S
    */
    
    public void run() {

        // Variable 
        int intN;

        // User Input
        intN = readInt("Enter an interger: ");

        boolean isPrime = true;

        if (intN == 2){
            isPrime = true;
        }

        for (int divider = 2; divider < intN; divider++){
            if (intN % divider == 0){
                //System.out.println("This is a composite number");
                isPrime = false;
                break;
            }
        }
      
        if (isPrime){
            System.out.println("This number is prime.");
        }
        else{
            System.out.println("This number is composite.");
        }
        
    }
  }
  