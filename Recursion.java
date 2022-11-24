/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 

/**
 *
 * @author sveinson-r
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // reursive fibonacci sequence
        Fibonacci f = new Fibonacci();
        int fibonacciNumber = f.fib(7);  // calculate the 10 fib number
        System.out.println("fib 10 = " + fibonacciNumber);
        
//       System.out.println(parseNum(1077747));
//       
//        if(parseNum(1077747) % 11 == 0)
//            System.out.println("number is divisible by 11");
//        else
//            System.out.println("number is not divisible by 11");
     
       
        //System.out.println(sumN(5));
        ex223(7);
        //System.out.println("" + factorial(10));
        
       // int base = 2;
       // int power = 7;
       // //System.out.println(base + "^" + exponent + " = " + raiseToPower(base, exponent));
        
        // Exponent exponent = new Exponent();
        // System.out.println(base + "^" + power + " = " + exponent.getPower(base, power));
        
        
        //Exponent exponent = new Exponent();
        //System.out.println(base + "^" + power + " = " + exponent.getPower(base, power));
    }
    
    /* recursive test for divisibility by 11
        drop the last digit and then subtract the last digit
        if the result is divisible by 11 then the number is likewise divisible by 11
        repear this process until a 2 digit number is all that's left
    */
    public static int parseNum (int n){
        if(n < 100)
            return n;
        else
            return parseNum(((n / 10)-(n % 10)));
        
    } // end parseNum
    
    public static int sumN(int n){
        if(n == 1)
            return(1);
        else
            return n + sumN(n - 1);
    } // end sumN
    
    public static int factorial( int n){
        if(n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    } // end factorial
    
    public static void ex223(int n){
        if(n <= 0)
            return;
        
        System.out.println(n);
        ex223(n -2);
        ex223(n - 3);
        System.out.println(n);
    } // end ex223
    
    
}
