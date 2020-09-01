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
public class pitcher {
    protected int ballSpeed;
    
    //constructer
    public void pitcher(){
        
    }
    
    protected int throwBall(){
        Random rand = new Random();
        ballSpeed = rand.nextInt(80);
        
        return(ballSpeed);
    }
    
}
