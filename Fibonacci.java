 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sveinson-r
 */
public class Fibonacci {
   private int n = 0;
    
    public Fibonacci(){
        n = 0;
        //getPower(base, power);
    } // end constructor
    
    public int fib(int n){
        if(n <= 2)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }
    
}
