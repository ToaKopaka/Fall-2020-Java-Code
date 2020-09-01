/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseball;

import java.util.Scanner;

/**
 *
 * @author George
 */
public class Baseball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of pitches you would like the batter to try and hit: ");
        int runAmount = scan.nextInt();
        int i = 0;
        
        while(i < runAmount){
        pitcher A = new pitcher();
        Ball B = new Ball();
        batter C = new batter();
        int Bspeed;
        
        Bspeed = A.throwBall();
        
        C.setBallSpeed(Bspeed);
        C.hit();
        
        
        
        i++;
        }
    }
    
}
