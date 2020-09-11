/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itco321ip4;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.ArrayList;
import java.io.File;

/**
 *
 * @author Jumbo Moose
 */
public class ITCO321IP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
    
    ArrayList al = new ArrayList();
    BufferedReader br = null;
    
    
    
    class User
    {
        public String firstName;
        public String lastName;
    }
    try {
    
        using (TextReader tr = new StreamReader("e:\\Data\\IP4SampleData.csv"))){
        while tr.Peek( >= 0){
    }
    //Read line and do stuff
    }
    
    Using (StreamReader sr = new StreamReader("e:\\Data\\IP4SampleData.csv")))
    {
        
        String line = null;
        while ((line = sr.ReadLine()) != null){
         //Do something here   
        }
    }
  
            br = new BufferedReader(new FileReader ("e:\\Data\\IP4SampleData.csv") ); 
            String line = null;
            while ((line = br.ReadLine()) != null) {

                // use comma as separator
                String[] values = line.split(",");
                 User newUser = new User();
                 newUser.firstName = values[0];
                 newUser.lastName = values[2];
                 al.add(newUser);

                System.out.println(line );
               
   }
       } catch (FileNotFoundException e) {
            e.printStackTrace();      
       
   

    
        }
    }}
     
   
    
    
    
    
    

    
    
    

