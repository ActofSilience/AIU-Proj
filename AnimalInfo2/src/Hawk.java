/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jumbo Moose
 */
public class Hawk extends Animals{
      //variable declaration
   String locationFound;
   String Color;
   String Order;
   String conservationStatus;
     
   
   
   //info
   public Hawk()
   {
       this.locationFound = "Eastern US";
       this.Color ="brown, red, orange, black";
       this.Order ="Buteo lineatus";
       this.conservationStatus = "Least Concern";
   }
   //Output
   public void displayInfo(){
       System.out.println("Animal Characteristics ; Red Shouldered Hawk");
       System.out.println("Located; " + this.locationFound);
       System.out.println("Animal color; " + this.Color);
       System.out.println("Belongs to order " + this.Order);
       System.out.println("Currently: " +this.conservationStatus);
       System.out.println("_____________________________________");
}}
