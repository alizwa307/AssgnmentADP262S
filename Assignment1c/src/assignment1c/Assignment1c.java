/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1c;
import java.util.Arrays;
/**
 *
 * @author          :Alizwa Solibanzi 
 * Student number :220001499
 * Stream           :Application Development
 */
public class Assignment1c {

  
    public static void main(String[] args) {
   //@author          :Alizwa Solibanzi 
  // * Student number  :220001499
  // * Stream          :Application Development
     
        String[]suite={"♠","♥","♦️","♣"};
     String []rank={"2","3","4","5","6" ,"7","8","9","10","J","K","A"};
     System.out.print("%Java deck \n");
       String[]deck= new String[52];
       

       for(int i=0;i<suite.length;i++)
       {
     
       for(int j=0;j<rank.length;j++)
       { 
       deck[suite.length*i+j]=rank[j]+suite[i]+" " ;  
           
       System.out.print( deck[suite.length*i+j]+";\t");
 
       }///end j
System.out.println("\n");

       }///end i
          System.out.print("%Java \n");
    }
      
}
