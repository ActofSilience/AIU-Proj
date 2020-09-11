
package animalinfo3;
import java.util.Scanner;
/**
 *
 * @author Jumbo Moose
 */
public class AnimalInfo3 {
           


    public static void main(String[] args) {
        // TODO code application logic here
    
      Animal animal = new Animal();

//Display menu
       try (Scanner scan = new Scanner(System.in)) {
           int input;
           do {

               System.out.println("Please enter your choice for animal.");
               System.out.println("1.Owl");
               System.out.println("2.Hawk");
               System.out.println("3.Platypus");
               System.out.println("4. Exit");
               input = scan.nextInt();
               
               //Determine input
               switch (input) {
                   case 1:
                       animal = new Owl();
                       animal.displayInfo();
                       break;
                   case 2:
                       animal = new Hawk();
                       animal.displayInfo();
                       break;
                   case 3:
                       animal = new Platypus();
                       animal.displayInfo();
                       break;
                   default:
                       System.out.println("Program exited!");
                       System.exit(0);
               }
           } while (input != 4);
       } finally {
           System.out.println("Program exited!");
       }//

       Animal animalAsOwl = new Owl();
       animalAsOwl.displayInfo();

       Animal animalAsHawk = new Hawk();
       animalAsHawk.displayInfo();
       
       Animal animalAsPlatypus = new Platypus();
       animalAsPlatypus.displayInfo();
   }
}