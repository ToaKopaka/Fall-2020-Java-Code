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
public class Pstack {
    //fields
    Stack<Character> CharStack = new Stack<>();
    private String word; 
    boolean Sentinal = true;
    
    //constructors
    public Pstack(String word){
        this.word = word;
    }
    
    
    //methods
    
    public void StringCleaner(){
        //replace all the spaces with empty ""
        for(int i = 0; i < word.length(); i++){
           word = word.replace(" ", "");
        }
        //make the word all lower case
        word = word.toString().toLowerCase();
        
        
        //Add all the characters to the Stack
        for(int i = 0; i < word.length(); i++){
            
            CharStack.push(word.charAt(i));
        }
    
    }
    
    public void CompairWord(){
      if(Sentinal == true){
    for(int i = 0; i < word.length(); i++){
           // turn the chars into Chacters so I can run .equals() on them
            Character A = word.charAt(i);
            Character B = CharStack.pop();
            //The for loop goes up the word while the Stack goes down the word compairing each letter to each other then if they are equal it will set the sentinal to true
            Sentinal = A.equals(B);
            
        }
      }
      if(Sentinal == false){
          System.out.println(word + " is not a palindrome.");
      }
     if(Sentinal == true){
      System.out.println(word + " is a palidrome.");
     }
    }
    
    
}
