/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Pseudocode
//1. Import scanner
//2. declare input variable
//3. declare class
//4. Display menu
//5.Get user input
//6. Determine user input
//7. Display relevant info
package animalinfo2;

import java.util.Scanner;

/**
 *
 * @author Jumbo Moose
 */
public class AnimalInfo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
                    
        Scanner scan = new Scanner (System.in);
       
               
    int input;
    //Display menu
    do {
            System.out.println("Select an option below by entering the reference number");
            System.out.println("1. Owls");
            System.out.println("2. Hawks");
            System.out.println("3. Platypus");
            System.out.println("4. Exit");
//determine user input
            input = scan.nextInt();
            
            Animals animalOwl = new Owl();
            animalOwl.displayInfo();
            
            
            switch (input) {
                case 1:
                    animal = new Owl();
                    animal.displayInfo();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Program terminated");
                    System.exit(0);
            }
}
     while (input !=4); 
        
    
   
    
   
    
    
    
        }
    }
    
}

    

    
    
