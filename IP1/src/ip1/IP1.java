/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip1;
import java.util.Scanner;

/**
 *
 * @author Jumbo Moose
 */
public class IP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner userInputScanner = new Scanner (System.in);
    // Declare variables
        String emplName;
        String emplAddress;
        String emplPosition;
        String favorRestaurant;
        String favorMeal; 
        
        //Program data input, process, output
        
        
        System.out.println("\n\nWelcome to ITSD322!");
        System.out.println("------------------------------------");
        
        //Ask user for name and other relevant info
        System.out.println("Enter your first name:  ");
        emplName = userInputScanner.nextLine();
        
        System.out.println("Enter your employer's address:  ");
        emplAddress = userInputScanner.nextLine();
        
        System.out.println("Enter your position:   ");
        emplPosition = userInputScanner.nextLine();
        
        System.out.println("What is your favorite restaurant? ");
        favorRestaurant = userInputScanner.nextLine();
        
        System.out.println("What is your favorite meal?  ");
        favorMeal = userInputScanner.nextLine();
        
        //Data process and output
        
        System.out.println("Your employee name is: " + emplName);
        System.out.println("Your employer's address is:   " + emplAddress);
        System.out.println("Your position is:  " + emplPosition);
        System.out.println("Your favorite restaurant is:  " + favorRestaurant);
        System.out.println("Your favorite meal is:  " + favorMeal);
        
        
        System.out.println("------------------------Program Terminate------------");
        
        
        
        
        
        
        
        
        
    
    }
    
    
    
}
