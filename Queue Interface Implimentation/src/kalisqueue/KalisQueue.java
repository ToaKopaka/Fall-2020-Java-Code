/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalisqueue;

/**
 *
 * @author George
 */
public class KalisQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KDeque<Integer> kq = new KDeque<>();
        kq.enqueueFront(4);
        kq.enqueueFront(5);
        kq.dequeueRear();
        kq.dequeueRear();
        
        
       
        int i = 0;
        while(!kq.isFull()){
        kq.enqueueRear(i);
        i++;
        }
        while(!kq.isEmpty()){
        System.out.println(kq.dequeueRear());
        }
        

        
        
        
    }
    
}
