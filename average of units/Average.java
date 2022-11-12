package average;
import java.util.Scanner;
public class Average {

	    public static void main(String[] args){
	        
	       int java,networks,math,cabling,total;
	        float avg;
	        Scanner sc = new Scanner (System.in);
	        System.out.println("Enter marks for java");
	        java = sc.nextInt();
	    System.out.println("Enter marks for networks");
	        networks = sc.nextInt();
	        System.out.println("Enter marks for maths");
	        math = sc.nextInt();
	        System.out.println("Enter marks for cabling");
	       cabling = sc.nextInt();
	       
	         
	         total = java+networks+math+cabling ;
	         avg = total/4;
	          System.out.println("The average is:" + avg);
	    }
	}


