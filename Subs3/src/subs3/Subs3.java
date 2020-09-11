/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subs3;
import javax.swing.*;        
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame{
       JFrame frame;
       JPanel panel;
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
    }}




/**
 *
 * @author Jumbo Moose
 */
public class Subs3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    JFrame frame = new JFrame("Welcome to Fred's Famous Subs!");
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set to close upon pressing X    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int height = screenSize.height;
    int width = screenSize.width; 
    frame.setSize(width/2, height/2); //set window to be half of screen size
   
    frame.setLayout(null); // center the jframe on screen
    
    JPanel panel = new JPanel();
    
    
    panel.setLayout(null);
    JLabel order = new JLabel("Please enter the following information to submit an order:");
   
    order.setBounds(10,10,300,15);
    panel.add(order);
    
    }
    
}
