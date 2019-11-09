
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        
   Scanner reader = new Scanner(System.in);
    
 /* String input =  "1 \n"
          + "hej\n"
          + "123\n"
          + "x\n"
          + "1\n"
          ;
  
    Scanner reader = new Scanner(input); */

    Interface ui = new Interface(reader);
    ui.start();
        
        
    }
}
