/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplestack;

/**
 *
 * @author Jumbo Moose
 */
import java.util.*; 
public class SimpleStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Stack<String> STACK = new Stack<String>(); 
    
        STACK.push("Ash");
	STACK.push("Glaz");
	STACK.push("Finka");
	STACK.push("Thermite");
	System.out.println("Initial stack: " + STACK);
	System.out.println("Popped Element: " + STACK.pop());
	System.out.println("Popped Element: " + STACK.pop());
	System.out.println("Stack after pop: "+  STACK);

    }
    
}
