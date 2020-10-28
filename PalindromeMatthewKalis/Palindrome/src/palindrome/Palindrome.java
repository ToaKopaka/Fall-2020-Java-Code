/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;

import java.util.Stack;

/**
 *
 * @author George
 */

public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pstack A = new Pstack("Racecar");
        A.StringCleaner();
        A.CompairWord();
        
        Pstack B = new Pstack("Tacocat");
        B.StringCleaner();
        B.CompairWord();
        
        
        Pstack C = new Pstack("A man a plan a canal Panama");
        C.StringCleaner();
        C.CompairWord();
        
        Pstack D = new Pstack("This is not a palindrome");
        D.StringCleaner();
        D.CompairWord();
        
        
        
    }
    
}
