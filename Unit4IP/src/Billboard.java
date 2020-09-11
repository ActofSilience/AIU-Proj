/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.util.Scanner;
/**
 *
 * @author Jumbo Moose
 */
public class Billboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner(System.in); 
    int input;
    Billboard billboard = new Billboard();
    
    //Display billboard
    System.out.println("==================================");
    System.out.println("|                                |");
    System.out.println("|  Enter a number 1-3            |");
    System.out.println("|                                |");
    System.out.println("|  1. Display predefined message |");
    System.out.println("|  2. Enter a custom message     |");
    System.out.println("|  3. Exit                       |");
    System.out.println("|                                |");
    System.out.println("|                                |");
    System.out.println("|                                |");
    System.out.println("==================================");
    input = scan.nextInt();
        switch (input) {
        //Display predefined message
            case 1:
                billboard = new predefineMessage();
                predefineMessage.displayInfo();
                break;
            case 2:
                //display custom text
                textInput ( );
                break;
            default:
                //exit program
                System.out.println("Program terminated");
                System.exit(0);
        }
    while (input !=3); 
    }{
    Billboard predefineMessage = new Billboard();
    predefineMessage.displayInfo();

    
    }
    
    
}
    

    

