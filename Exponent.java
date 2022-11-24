 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sveinson-r
 */
public class Exponent {
   private int base;
   private int power;
    
    public Exponent(){
        base = 0;
        power = 0;
        //getPower(base, power);
    } // end constructor
    
    public int getPower(int b, int p){
        if(p == 0)
            return 1;
        else
            return b * getPower(b, (p -1));
    }
    
}
