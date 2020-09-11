/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Jumbo Moose
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        {

      String csvFile = "e:\\Data\\IP4SampleData.csv";
      String line = "";
      ArrayList al = new ArrayList();
        
        
        class User
    {
        public String firstName;
        public String lastName;
        public String companyName;
        public String zipCode;
        public String state; 
    }
      
        
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        
	    while ((line = br.readLine()) != null) {
	   
                 
                
                     ArrayList<String> userList = new ArrayList<String>();
                 
                
                 String[] values = line.split(",");
                 User newUser = new User();
                 newUser.firstName = values[0];
                 newUser.lastName = values[1];
                 newUser.companyName = values[2]; 
                 newUser.zipCode = values[7];
                 newUser.state = values[6];
                 al.add(newUser);
                 userList.add(values[0]);
                 userList.add(values[1]);
	   
   
	  
	   /*Unsorted List*/
	   System.out.println("Before Sorting:");
	   for(Object counter: al){
			System.out.println(al);
		}

	   /* Sort statement*/
	   Collections.sort(userList);

	   /* Sorted List*/
	   System.out.println("After Sorting:");
	   for(String counter: userList){
			System.out.println(userList);
		}}}}}}