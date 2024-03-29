class D1GramsToPounds extends ConsoleProgram {

    /**
    * Description: This program outputs a formatted table that shows a conversion 
    from grams to pounds from 100 to 1000 grams.
    - The table should display for every 100 grams.
    - The pounds values must be calculated.
    - The grams column should be formatted to take up 6 spaces
    - The pounds column should be formatted to take up 10 spaces.
    * @author:A. Emmanuel-Singh
    */
    
    public void run() {

        // Output to user 
        System.out.printf("----------------------- %n");
        System.out.printf("|   GRAMS TO POUNDS   | %n");
        System.out.printf("----------------------- %n");
        System.out.printf("| %6s | %10s | %n", "GRAMS", "POUNDS");
        System.out.printf("| %6s | %010s | %n", "907.2", "2");
        System.out.printf("| %6s | %010s | %n", "1360.9", "3");
        System.out.printf("| %6s | %010s | %n", "1814.4", "5");
        System.out.printf("----------------------- %n");
      
    }
  }
  
