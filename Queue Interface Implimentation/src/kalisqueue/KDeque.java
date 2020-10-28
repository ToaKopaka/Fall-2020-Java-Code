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
public class KDeque<T> implements DequeInterface<T> {
    //fields
    private T[] innerArray;
    private int front, back, count;
    
    


    //constructor
    public KDeque(){
        innerArray =(T[]) new Object[100];
        front = 0;
        back = 0;
        count = 0;
    }
    




    //methods
    
    
    
    
    @Override
    public void enqueueFront(T element) throws QueueOverflowException {
        //test
        if(isFull()){
            throw new QueueOverflowException();
        }else{
            innerArray[front] = element;
            front++;
            if(front >= innerArray.length){
                front = 0;
            }
            count++;
        }
    }

    @Override
    public void enqueueRear(T element) throws QueueOverflowException {
        if(isFull()){
            throw new QueueOverflowException();
        }else{
            innerArray[back] = element;
            back++;
            if(back >= innerArray.length){
                back = 0;
            }
            count++;
        }
        
        
        
    }

    @Override
    public T dequeueFront() throws QueueUnderflowException {
        if(isEmpty()){
            throw new QueueUnderflowException();
        } else{
            T result = innerArray[front];
            
            front++;
            if(front >= innerArray.length){
                front = 0;
            }
            count--;
            return result;
        }
        
    }

    @Override
    public T dequeueRear() throws QueueUnderflowException {
        //Test
        if(isEmpty()){
            throw new QueueUnderflowException();
        } else{
            T result = innerArray[back];
            
            back++;
            if(back >= innerArray.length){
                back = 0;
            }
            count--;
            return result;
        }
    }

    @Override
    public boolean isFull() {
        return count == innerArray.length;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }
    
}


