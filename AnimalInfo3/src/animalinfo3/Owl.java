package animalinfo3;

/**
 *
 * @author Jumbo Moose
 */
//Declare child class, inheritance, & Variables
public class Owl extends Animal {
    
    String locationFound;
    String color;
    String Species;

//Data
Owl(){
this.locationFound = "Global";
this.color = "gold, white, tan";
this.Species = "Tyto Alba";
}
//Data output
@Override
public void displayInfo(){
System.out.println("Characteristics of: Barn Owl");
System.out.println("Located at: " + this.locationFound);
System.out.println("Colors include " + this.color);
System.out.println("Species Epiphet: " + this.Species);
System.out.println("______________________________________");
}}


    

