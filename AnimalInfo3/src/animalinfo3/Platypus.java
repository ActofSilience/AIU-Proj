package animalinfo3;

/**
 *
 * @author Jumbo Moose
 */
//Declare child class & Variables
public class Platypus extends Animal {
    
    String locationFound;
    String color;
    String Species;

//Data
Platypus(){
this.locationFound = "Australia";
this.color = "Black, blue, white";
this.Species = "Ornithorhynchus anatinus";
}
//Data output
@Override
public void displayInfo(){
System.out.println("Characteristics of: Platypus");
System.out.println("Located at: " + this.locationFound);
System.out.println("Colors include " + this.color);
System.out.println("Species Epiphet: " + this.Species);
System.out.println("______________________________________");
}}
    

