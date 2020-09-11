/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jumbo Moose
 */
public class owl {
    int NumberOfSpecies;
    String Color;
    String Group;
    
    Owl()
    {this.NumberOfSpecies = 2;
    this.Color = "Gay";
    this.Group = "Bird";
    }
   @Override
   public void displayInfo(){
       System.out.println("Details");
       System.out.println("Species" + this.NumberOfSpecies);
       System.out.println("Color" + this.Color);
       System.out.println("Group " + this.Group);
       System.out.println("___________________________");
   }
    
}
