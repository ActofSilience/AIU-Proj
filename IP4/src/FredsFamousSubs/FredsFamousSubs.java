/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FredsFamousSubs;
import javax.swing.*;        
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


   class Frame{
       JFrame frame;
   }


    
   class Order{
    String beverage;
    String bread;
    String type;
    String size;
    int quantity;
    
    //constructor
    public Order(String bev, String bred, String t, String s, Integer q){
        beverage = bev;
        bread = bred;
        type = t;
        size = s;
        
        //wrapper class
        quantity = q;
    }
//Method to retrieve order info
public String getOrderInfo(){
return "" + beverage + "" + bread + "" + type +"" + size;
}
}
class Customer{
    String name;
    Order order;
    //constructor
    public Customer(String nam, Order or){
        name = nam;
        order = or;
    }
    public String getName(){
        
    return name;
}
    public String getOrder(){
        return order.getOrderInfo();
    }

/**
 *
 * @author Jumbo Moose
 */

    public static void main(String[] args) {
        FredsFamousSubs db = new FredsFamousSubs();
        JFrame frame = new JFrame();
    frame = new JFrame(" Welcome to Fred's Famous Subs"); //Create a frame
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set to close upon pressing X
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int height = screenSize.height;
    int width = screenSize.width; 
    frame.setSize(width/2, height/2); //set window to be half of screen size
   
    frame.setLayout(null); // center the jframe on screen
   
    JLabel order = new JLabel("Please enter the following details to complete your order:");
    
    
    
    JPanel panel = new JPanel();
    frame.add(panel);
    panel.setLayout(null);
    panel.add(order);
    
    
    JButton submit = new JButton("Submit");
    panel.add(submit); 
}  
}    


