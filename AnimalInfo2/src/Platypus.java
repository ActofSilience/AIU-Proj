/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jumbo Moose
 */
public class Platypus extends Animals{
      //Declare variables
   String locationFound;
   String Color;
   String Order;
   String conservationStatus;
   
   
   //Data
   public Platypus()
   {
       this.locationFound = "Australia";
       this.Color ="Black, tan, brown";
       this.Order =" Ornithorhynchus anatinus";
       this.conservationStatus = "No concern";
   }
   //Output
   public void displayInfo(){
       System.out.println("Animal Characteristics ; Platypus");
       System.out.println("Located; " + this.locationFound);
       System.out.println("Animal color; " + this.Color);
       System.out.println("Belongs to order " + this.Order);
       System.out.println("Currently: " +this.conservationStatus);
       System.out.println("_____________________________________");

}}
