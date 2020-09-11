/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip3;

/**
 *
 * @author Jumbo Moose
 */
public class MessagePred extends IP3 {
    
    String existMessage;
    
    
    public MessagePred() {
        this.existMessage = "Alexander Shunnarah";
    }
    
    /**
     *
     */
 
    public void displayInfo()
    {
    System.out.println("==================================");
    System.out.println("|                                |");
    System.out.println("|   " + this.existMessage + "    |");
    System.out.println("|                                |");
    System.out.println("|                                |");
    System.out.println("|                                |");
    System.out.println("|                                |");
    System.out.println("|                                |");
    System.out.println("|                                |");
    System.out.println("==================================\n");
    }
}
