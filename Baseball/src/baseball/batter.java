/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseball;

import java.util.Random;

/**
 *
 * @author George
 */
public class batter {
    Random rand = new Random();
    int ballSpeed;
    
    
    
    public void batter(){  
    }
   
    public void setBallSpeed(int Speed){
        ballSpeed = Speed;
       
    }
    
    public void hit(){
         int range = rand.nextInt(80);
        if(range >= ballSpeed){
            System.out.println("The batter hit the ball at " + ballSpeed + "MPH!");
        }
        else{
            System.out.println("The batter missed the ball! It was going " + ballSpeed + "MPH!" );
        }
    }
    
}
