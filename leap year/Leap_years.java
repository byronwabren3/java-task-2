 /*
*The below program is meant to find out if the year is a leap year or not
*/
package methods;
/*
 *importation of scanner
  
 */
import java.util.Scanner;
/*
*the class function
*/
public class Leap_years {

    /*
    *the main function
    */
    public static void main(String args[]) {
        int year;
        System.out.println("Enter your year");
         Scanner sc = new Scanner(System.in);
       year = sc.nextInt();
       /*
       *If else statement
       *...we use %4 because a leap year comes after every 4 years
       */
       if(year%4==0)
       {
         System.out.println("leap year");  
       }
       else
       {
           System.out.println("not leap year");
       }
    }
}
    

