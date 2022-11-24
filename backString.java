 

/* **********************************************************
 * Programmer:    your name here
 * Class:        CS30S
 * 
 * Assignment:    aX  qY
 *
 * Description:    brief description of program here
 *
 * Input:        state all input here
 *
 * Output:        state what will be output here
 * *************************************************************
 */
 
 // import files here as needed
 
 import javax.swing.*;                // needed for dialog box i/o
 import java.text.DecimalFormat;    // needed for formatting output numbers
import java.util.Scanner;
 
 public class backString
 {  // begin class
     public static void main(String[] args)
     {  // begin main
     // ********** declare constants **********
     
         
     // *********** declare variables **********
         
         String strin;        // input string
         String strout;        // output string
         
     // create a console reader to get input from keyboard
     
        Scanner console = new Scanner(System.in);
        
     // ***** create output banner for message dialog *****
     
         strout = "*********************************\n";
         strout += "NAME:        Your name here\n";
         strout += "CLASS:        CS20S\n";
         strout += "ASSIGNMENT:    Ax Qy\n";
         strout += "**********************************\n";
          
     // ******** print banner **********
     
         System.out.println("*********************************");
         System.out.println("NAME:        Your name here");
         System.out.println("CLASS:        CS20S");
         System.out.println("ASSIGNMENT:    Ax Qy");
         System.out.println("**********************************");
         
         // to message dialog
         
         //JOptionPane.showMessageDialog(null, strout);

    // ********** get input **********
    
        System.out.println("enter a string.");
        strin = console.nextLine();
        
    // ********** calculations **********
    
        printBack(strin);
        
    // ********** output ********** 
    
        
     // ********** closing message **********
     
         System.out.println("end of processing");
     
     }  // end main
     
     public static void printBack(String strin)
     {
         if(strin.length() == 0)
             System.out.println("\ndone");
         else
         {
             System.out.print(strin.charAt(strin.length() - 1));            
             printBack(strin.substring(0, strin.length() - 1));
         }
      }  // end fac
 }  // end class