/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorkalis;

import java.util.Iterator;

/**
 *
 * @author George
 */
public class Sentence implements Iterable<String> {

   private String FullSentence = "";
   
   
   public Sentence(String FullSentence){
       this.FullSentence = FullSentence;
   } 
    
    
    
   public String toString(){
        return FullSentence;
    }
    
    public Iterator<String> iterator() {
        return new Iterator<String>(){
            private int pos = -1;
            String[] StrAry = FullSentence.split(" ");
             
            @Override
            public boolean hasNext() {
                return (pos < (StrAry.length - 1));
                
            }

            @Override
            public String next() {  
                pos++;
                return StrAry[pos];
            }
 
            
            
        };
       
    }
    
}
