/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip3;
import java.util.Scanner;
/**
 *
 * @author Jumbo Moose
 */
public class IP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    Scanner scan = new Scanner(System.in); 
    try{
    int input;
    Billboard billboard = new Billboard();
    
    //Display billboard
    do{
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
                Billboard = new MessagePred();
                billboard.displayInfo();
                break;
            case 2:
                //display custom text
                System.out.println("Please input your own message: ");
                textInput ( );
                break;
            default:
                //exit program
                System.out.println("Program terminated");
                System.exit(0);
        }
    while (input !=3); 
    finally {
            scan.close();
            }
    {
   Billboard MessagePred = new Billboard();
   MessagePred.displayInfo();
    
    
    }}
    

