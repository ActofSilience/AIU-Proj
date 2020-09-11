/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author Jumbo Moose
 */


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JOptionPane; 

public class javaapplication10 {
  JFrame frame;//defining a frame in public class
    public static void main(String[] args) {
         javaapplication10 db = new javaapplication10(); 
  
    
   
  }
     public javaapplication10(){
  frame = new JFrame("FamousFavouriteSubs"); 
  frame.pack();// to autosize the frame
  frame.setVisible(true);
//  what happen when the user  clicks the close button
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  JButton button = new JButton("order Now");
  button.addActionListener(new MyAction());
  frame.add(button);
 ///Below code makes the frame size half the size of the computer screen
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int height = screenSize.height;
    int width = screenSize.width;
    frame.setSize(width/2, height/2);
     // center the jframe on screen
    frame.setLocationRelativeTo(null);
 
  }
  public class MyAction implements ActionListener{
  public void actionPerformed(ActionEvent e){
       // prompt thecustomer to enter their name
               
    String name = JOptionPane.showInputDialog(frame, "Enter your name");
     // prompt thecustomer to enter their delivery address
     String adress = JOptionPane.showInputDialog(frame, "Enter your Address");
     
      // prompt thecustomer to enter their favourite beverage
     String beverage = JOptionPane.showInputDialog(frame, "Enter your favourite beverage");
      // prompt thecustomer to enter their favourite sub bread
     String sub_bread= JOptionPane.showInputDialog(frame, "Enter your favourite sub bread");
     
        // prompt thecustomer to enter their favourite sub type
     String sub_type = JOptionPane.showInputDialog(frame, "Enter your  sub type");
        showInputDialog();
     
  JOptionPane.showMessageDialog(frame,
          "Welcome  \t"+name+"  \tto"+
          "\n****FamousFavouriteSubs****"+
          "\n Your favourite  selection in FamousFavouriteSubs include:\t"+
          "\n SUB BREAD:\t"+sub_bread+
          "\nFavourite Beverage:\t"+beverage+
           "\nSUB TYPE:\t"+sub_type+
           "\nSUB SIZE:\t"+showInputDialog()+
          "\nYour favourites to be delivered to:\t"+adress+
          "\n Thank for visiting us come again");
  }
 public String showInputDialog()
{
    // prompt thecustomer to enter their favourite sub size
    String inputValue = JOptionPane.showInputDialog("Enter sub size");

    if(inputValue == null || inputValue.isEmpty() || inputValue.matches("[A-Za-z]*"))
    {
        JOptionPane.showMessageDialog(frame,"Enter only integer");
        inputValue = showInputDialog();//call the fuction again until the condition is met
    }

    return inputValue;
}
  }
    
}

