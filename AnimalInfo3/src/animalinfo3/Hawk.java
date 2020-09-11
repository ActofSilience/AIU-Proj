package animalinfo3;

/**
 *
 * @author Jumbo Moose
 */
//Declare child class & Variables
public class Hawk extends Animal {
    
    String locationFound;
    String color;
    String Species;

//Data
Hawk(){
this.locationFound = "Eastern US";
this.color = "gold, red, grey";
this.Species = "Buteo lineatus";
}
//Data output
@Override
public void displayInfo(){
System.out.println("Characteristics of: Red Shouldered Hawk");
System.out.println("Located at: " + this.locationFound);
System.out.println("Colors include " + this.color);
System.out.println("Species Epiphet: " + this.Species);
System.out.println("______________________________________");
}}
    

