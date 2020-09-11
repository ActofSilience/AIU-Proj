


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jumbo Moose
 */
public class Owl extends Animals {
    
 
 //Variable declaration
   String locationFound;
   String Color;
   String Order;
   String conservationStatus;
        
    //Info
   Owl ()
           
   {
       super();
       this.locationFound = "Global";
       this.Color ="White, gold, black";
       this.Order ="Tyto Alba";
       this.conservationStatus = "Least concern";

   }
   //Output
   
       public void displayInfo(){
           
       System.out.println("Animal Characteristics ; Barn Owl");
       System.out.println("Located; " + this.locationFound);
       System.out.println("Animal color; " + this.Color);
       System.out.println("Belongs to order " + this.Order);
       System.out.println("Currently: " +this.conservationStatus);
       System.out.println("_____________________________________");
            
       }
}
