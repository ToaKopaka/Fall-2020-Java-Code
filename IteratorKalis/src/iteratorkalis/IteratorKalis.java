/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorkalis;

/**
 *
 * @author George
 */
public class IteratorKalis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String A = "My name is Matthew Kalis";
        String B = "I am learning Java data structures";
        
        Sentence A1 = new Sentence(A);
        Sentence B2 = new Sentence(B);
   
        if (A1.iterator().hasNext()){
            for (String  a : A1){
                System.out.println(a);
            }
        }
        System.out.print("\n");
                if (B2.iterator().hasNext()){
            for (String  a : B2){
                System.out.println(a);
            }
        }
             
    }
    
}
