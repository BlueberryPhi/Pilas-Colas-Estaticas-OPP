/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class MyQueue {
  int MAX = 10;
  char[] queue = new char[MAX];
  int tail = 0; 


    public char delete() {
      
        if (tail == 0) {
            return '#';
        }
        char firstElement = queue[0];
        for (int i = 1; i < tail; i++) {
            queue[i - 1] = queue[i];
        }
        tail--;
        return firstElement;
    }
      public void insert(char data) {
        if (tail == MAX) {
            System.out.println("Queue is full");
        } else {
            queue[tail] = data; 
            tail++; 
        }
    }
}