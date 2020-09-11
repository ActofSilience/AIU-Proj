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
public class customInput {
    public static void TextInput()
    {
    Scanner sc = new Scanner(System.in);
    String customInput;
    
    System.out.println("Enter a string to be displayed in the billboard\n");
    customInput = sc.next();
    //Allow user to input custom message
    System.out.println("==================================");
    System.out.println("|                                |");
    System.out.println("|                                |");
    System.out.println("| You entered:                   |");
    System.out.println("| " + customInput + "            |");
    System.out.println("|                                |");
    System.out.println("|                                |");
    System.out.println("|                                |");
    System.out.println("|                                |");
    System.out.println("|                                |");
    System.out.println("==================================\n");
}

}
