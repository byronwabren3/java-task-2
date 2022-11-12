/*
 * the following program i created to enter the units and find the average 
 */
package average;
/*

 * importation of scanner
 */
import java.util.Scanner;
public class Average {

	    public static void main(String[] args){
	    	/*
	    	 * declaration of variables
	    	 */
	        
	       int java,networks,math,cabling,total;
	        float avg;
	        Scanner sc = new Scanner (System.in);
	        /*
	         * this allows user to input marks in the screen
	         */
	        System.out.println("Enter marks for java");
	        java = sc.nextInt();
	    System.out.println("Enter marks for networks");
	        networks = sc.nextInt();
	        System.out.println("Enter marks for maths");
	        math = sc.nextInt();
	        System.out.println("Enter marks for cabling");
	       cabling = sc.nextInt();
	       /*
	        * calculation of the total and average
	        */
	         
	         total = java+networks+math+cabling ;
	         avg = total/4;
	          System.out.println("The average is:" + avg);
	    }
	}


