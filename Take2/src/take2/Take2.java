/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package take2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;


 // @author Jumbo Moose
 //
   class Patient
    {
        public String firstName;
        public String lastName;
        public String companyName;
        public String zipCode;
        public String state; 
        public String city;
        public String county;
        public String phone;
        public String fax;
        public String email;
        public String web;
        public String pig;
        public String address;
    }
 class CustomComparatorLastName implements Comparator<Patient>{
    public int compare(Patient object1, Patient object2){
        return object1.lastName.compareTo(object2.lastName);
    }}
class CustomComparatorZip implements Comparator<Patient>{
  public int compare(Patient object1, Patient object2){
    return object2.zipCode.compareTo(object1.zipCode);
            }}

        
        
public class Take2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
      String csvFile = "e:\\Data\\IP4SampleData.csv";
      String line = "";
      ArrayList<Patient> al = new ArrayList<Patient>(); 

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                

                 String[] values = line.split(",");
                 Patient myPatient = new Patient();
                 myPatient.firstName = values[0];
                 myPatient.lastName = values[1];
                 myPatient.companyName = values[2]; 
                 myPatient.zipCode = values[7];
                 myPatient.state = values[6];
                 myPatient.city = values[4];
                 myPatient.county= values[5];
                 myPatient.email=values[10];
                 myPatient.web= values[11];
                 myPatient.address = values[3];
                 myPatient.phone = values[8];
                 myPatient.fax = values[9];
                 myPatient.pig = values[12];
                 
                 al.add(myPatient); 
            }
            System.out.println("Sorted Alphabetically:" );
            Collections.sort(al,new CustomComparatorLastName());
          for (int i=0; i<al.size(); i++){
              
           
            System.out.println("Name:" + al.get(i).firstName + ", " + al.get(i).lastName + ", works at " + al.get(i).companyName);
            
            
          
          }
          System.out.println("Sorted descending by Zip Code:");
          Collections.sort(al, new CustomComparatorZip());
          for (int k=0; k<al.size(); k++){  
          System.out.println("Name: " + al.get(k).firstName + ", "  + al.get(k).lastName + ": Works at " + al.get(k).companyName +", " + al.get(k).zipCode);
        }
          System.out.println("All Patients in New York: ");
          
         
          for (int m=0; m < al.size(); m++){
              
              if ("NY".equals(al.get(m).state))
              System.out.println(al.get(m).firstName +", " + al.get(m).lastName +", "+ al.get(m).companyName + ", " +al.get(m).address + ", " + al.get(m).city +", " +al.get(m).state +", " + al.get(m).state + ", " + al.get(m).phone +", " + al.get(m).fax + ", "+ al.get(m).email +", " + al.get(m).web +", " + al.get(m).pig) ;
              
          }
        }
           catch (FileNotFoundException e) {
            e.printStackTrace();     

           }}}

    

    
    
    
    

   
   


    
 
    

    

     

