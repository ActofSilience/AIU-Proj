/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalinfo;
import java.util.Scanner;

/**
 *
 * @author Jumbo Moose
 */
public class AnimalInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
        Scanner scan = new Scanner (System.in);
    
    Animals animal = new Animals();
    int input = 4;
    do {
            System.out.println("Select an option below by entering the reference number");
            System.out.println("1. Owls");
            System.out.println("2. Hawks");
            System.out.println("3. Platypus");
            System.out.println("4. Exit");
    input = scan.nextInt();

    switch (input) 
 { 
    case 1:
    animal = new Owl();
    animal.displayInfo();
    
    case 2:
    animal = new Hawk();
    animal.displayInfo();
   
    case 3:
    animal = new Platypus();
    animal.displayInfo();

    case 4:
    System.out.println("Program terminated");
}
System.exit(0);
}
    } while (input !=4); 
Animals animalOwl = new Owl();
animalOwl.displayInfo();
Animals animalHawk = new Hawk();
animalHawk.displayInfo();
Animals animalPlatypus = new Platypus();
animalPlatypus.displayInfo();
    }
            
    
    
   
    
    
          
      
    
    

