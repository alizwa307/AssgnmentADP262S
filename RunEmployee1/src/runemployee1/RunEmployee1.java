


package runemployee1;

/**
 *
 * @author       :ALIZWA SOLIBANZI
 * STUDENT NUMBER: 220001499
 * CLASS         :1C
 *      
 */
import java.util.*;
import java.lang.*;
import java.io.*;
public class RunEmployee1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Manager1 M= new Manager1();
        Secretary1 S = new Secretary1();
       
        Employee1[] E = new Employee1[10];
        
////////////////////////////////////////////////////////////// Employees  there are 6 of them
            E[0]= new Employee1("Liya",5000.00,37.5,15);
            E[1]= new Employee1("Shaun",5000.00,37.5,15);
            E[2]= new Employee1("April",5000.00,37.5,15);
            E[3]= new Employee1("Emily",5000.00,37.5,15);
            E[4]= new Employee1("Tom",5000.00,37.5,15);
            E[5]= new Employee1("Linda",5000.00,37.5,15);
           
/////////////////////////////////////////////////////////////////////////Managers there are 2 of them
           
            E[6]= new Manager1("Josh",5000.00,37.5,18);
            E[7]= new Manager1("Mike",5000.00,37.5,18); 
////////////////////////////////////////////////////////////////////////Secretary there are 2 of them
            
             E[8]= new Secretary1("Rose",7000.00,40,15);
             E[9]= new Secretary1("Scarllet",7000.00,40,15);
            
         System.out.print(Arrays.toString(E)); 
           System.out.println("\n==============================================\n");
            E[0].work(); 
            E[0].leaveApplication(); 
             System.out.println("\n==============================================\n");
            E[6].work();
            E[6].leaveApplication();
             System.out.println("\n==============================================\n");
             E[8].work();
              E[8].leaveApplication();
               System.out.println("\n==============================================\n");
            
///////////////////////////////////////////////////////////// employees average salary calculations
         
        double ESsalary= 50000.00;//employee and secretary salary
        double Msalary=70000.00;//Manager salary
        double avSal= (ESsalary*8)+(Msalary*2)/10;////8== number of employee and secretary
         System.out.println("The avarage salary of employees is R"+avSal);
        System.out.println("\n==============================================\n");
/////////////////////////////////////////////////////////////// cost of leave for employee and secretary to the company
        double DayPay=ESsalary/262;//DayPay is the daily payment of employee
        double LeaveCost=DayPay*15; 
            System.out.println("The cost of leave for each employee to the company is R"+LeaveCost);
              System.out.println("\n==============================================\n");
//////////////////////////////////////////////////////////////////////  cost of leave for managers to the company            
            double DayPay1=Msalary/262;////262==  the number of working days per year
            double LeaveCost1=DayPay1*15; 
            System.out.println("The cost of leave for each Manager to the company is R"+LeaveCost1);
              System.out.println("\n==============================================\n");
           
           
           
           
           
           
           
           
           
       

    }

}
