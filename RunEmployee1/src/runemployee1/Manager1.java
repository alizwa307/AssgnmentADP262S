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
public class Manager1 extends Employee1
{////////////////
   Manager1()
   {
    
   }
  
   Manager1(String name,double Salary, double Hours, int LeaveDays )
   {
  super.setName(name);
   }
   @Override
    public int getLeaveDays()
    {
   int LeaveDays= 3;
   return LeaveDays;
    }
   @Override
    public double getSalary()
    {
       double Salary= 20000.00;
    return Salary;  
    }  
   @Override
      public void leaveApplication()
    {
      System.out.println("Qualify for 18 days leave");  
    }
   @Override
    public void work()
    {
     System.out.println("Managers Knows how to Manage and");   
    }
   @Override
   public String toString()
   {
 
      String man = String.format(
           " \n Manager Name is %s \n Salary: R%.2f \n Hours worked:%.2f \n Leave days: %d "
            ,super.getName(),super.getSalary()+getSalary(),super   .getHours(),super.getLeaveDays()+getLeaveDays())
     +"\n==============================================" ;
    return man;   


   }
}////////////////
