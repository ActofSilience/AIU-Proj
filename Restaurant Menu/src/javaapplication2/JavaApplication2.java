/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;


/**
 *
 * @author Jumbo Moose
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             // TODO code application logic here
    Scanner sc = new Scanner(System.in);
             // declare variables 
            
    int menuItem;
    double cashPayment = 0;
    double changeAmt = 0;
    double totalSaleAmount = 0;
    int customerQuant = 0;
    double totalAmount = 0;
    
    Boolean exitLoop = false;
    
//Display menu
    System.out.println("=========================================");
    System.out.println("|        Restaurant Manu                |");
    System.out.println("=========================================");                
    System.out.println("|  Options:                             |");
    System.out.println("| 1. Big ol' Burger         $5.99       |");
    System.out.println("| 2. Not so French Fries    $4.99       |");        
    System.out.println("| 3. Water                  $1.99       |");
    System.out.println("| 4. Obnoxious Vegan Salad  $10.29      |");        
    System.out.println("| 5. Country Fried Steak    $8.99       |");
    System.out.println("| 6. Soda                   $2.59       |");
    System.out.println("| 7. Shrimp Basket          $5.99       |");
    System.out.println("| 8. Steamed Hams           $8.99       |");
    System.out.println("| 9. Big Smoke w/ Extra Dip $5.59       |");
    System.out.println("| 10. Hootin' Hot Wings     $7.99       |");
    System.out.println("| 11. EXIT                              |");
    System.out.println("========================================="); 
            
    System.out.println("What would you like to order?");
       while (!exitLoop)
       
    {//Get user input
        menuItem = sc.nextInt();
                       
        //determine items selected
          switch (menuItem)
          { case 1:
              System.out.println("Big ol' Burger at $5.99");
              totalSaleAmount = totalSaleAmount + 5.99;
              break;
          case 2:
              System.out.println("Not so French Fries at $4.99");
              totalSaleAmount = totalSaleAmount + 4.99;
              break;
          case 3:
              System.out.println("Water at $1.99");
              totalSaleAmount = totalSaleAmount + 1.99;
              break;
          case 4:
              System.out.println("Obnoxious Vegan Salad at $10.29");
              totalSaleAmount = totalSaleAmount + 10.29;
              break;
          case 5:
              System.out.println("Country Fried Steak at $8.99");
              totalSaleAmount = totalSaleAmount + 8.99;
              break;
          case 6:
              System.out.println("Soda at $2.59");
              totalSaleAmount = totalSaleAmount + 2.59;
              break;
          case 7:
              System.out.println("Shrimp Basket at $5.99");
              totalSaleAmount = totalSaleAmount + 5.99;
              break;
          case 8:
              System.out.println("Steamed Hams at $8.99");
              totalSaleAmount = totalSaleAmount + 8.99;
              break;
          case 9:
              System.out.println("Big Smoke with extra dip at $5.59");
              totalSaleAmount = totalSaleAmount + 5.59;
              break;
          case 10:
              System.out.println("Hootin' Hot Wings at $7.99");
              totalSaleAmount = totalSaleAmount + 7.99;
              break;
          case 11:
              exitLoop = false;
              break;
          
          default:
                       
          System.out.println("Invalid selection, please enter another option");
            }
          if (menuItem == 11){
              System.out.println("Have a nice day!");
              break;
          }
          else
          
          System.out.println("Please enter quantity wanted: "); 
          customerQuant = sc.nextInt(); 
          totalAmount = totalSaleAmount * customerQuant; 
          System.out.println("Your total is: $" + totalAmount);  
          
       System.out.println("Input your cash payment amount:");
       cashPayment = sc.nextDouble();
                  
       changeAmt = cashPayment - totalAmount;
       System.out.println("Your change is: $" + changeAmt);
          
      System.out.println("Thank you for your patronage, have a nice day!");
      break;
    
       
             
          
        }                          
    } 
}                  
              

          
                  
          
            
    

