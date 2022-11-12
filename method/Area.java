/*
 * the following program i created to enter the base and height of triangle to find are
 */
package method;
/*

 * importation of scanner
 */
import java.util.Scanner;
public class Area {

	    public static void main(String[] args){
	    	/*
	    	 * declaration of variables
	    	 */
	        
	       int base = 0;
	       int height = 0;
	       int area = 0;
	        
	        Scanner sc = new Scanner (System.in);
	        /*
	         * this allows user to input marks in the screen
	         */
	        System.out.println("Enter base of the triangle");
	        base = sc.nextInt();
	    System.out.println("Enter height of the triangle");
	        height = sc.nextInt();
	       
	       /*
	        * calculation of the area = (base*height)/2
	        */
	         area = (base*height)/2;
	         
	          System.out.println("The average is:" + area);
	    }
	}
