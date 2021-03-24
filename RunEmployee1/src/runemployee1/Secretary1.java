/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runemployee1;

/**
 *
 * @author       :ALIZWA SOLIBANZI
 * STUDENT NUMBER: 220001499
 * CLASS         :1C
 */
public class Secretary1 extends Employee1
{///////////////////
  
    Secretary1()
    {
        
    }
    Secretary1(String name, double Salary, double Hours, int LeaveDays)
    {
      
   super.setName(name);
    }
    @Override
    public double getHours()
    {
      double Hours= 2.5;
      return Hours;
    }
    @Override
    public void work()
    {
    System.out.println(" Secretary Knows how to type and"); 
    }
    @Override
     public String toString()
   {
 
      String sec = String.format(
           " \n Secretary Name is %s \n Salary: R%.2f \n Hours worked:%.2f \n Leave days: %d"
            ,super.getName(),super.getSalary(),super.getHours()+getHours(),this.getLeaveDays())
              +"\n==============================================\n";
    return sec; 
    
   }
    
    
  
    
    
}/////////////////////////////
