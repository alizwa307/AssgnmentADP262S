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

public class Employee1
{/////////////////
 private String name;
  
  Employee1()
{

}
  Employee1(String name,double Salary, double Hours, int LeaveDays )
  {
     this.name=name; 
  }
  
    
    public void setName(String Name)
    {
      this.name= Name;  
    }
    public String getName()
    {
      return   this.name;  
    }
    public double getSalary()
    {
    double Salary= 50000.00;
    return Salary;
    }
    public double getHours()
    {
      double Hours= 37.5;
      return Hours;
    }
    public int getLeaveDays()
    {
    int LeaveDays= 15;
    return LeaveDays;
    }
    public void leaveApplication()
    {
         System.out.println("Qualify for 15 days leave");
    }
    public void work()
    {
      System.out.println("Employees Knows how to work and ");  
    }
    
  @Override
     public String toString()
   {
    String str = String.format(
            " \n Employee Name is %s \n Salary: R%.2f \n Hours worked:%.2f \n Leave days: %d"
            ,this.name,this.getSalary(),this.getHours(),this.getLeaveDays())+
            "\n==============================================\n";
    
    return str;
   } 
}////////////////////
