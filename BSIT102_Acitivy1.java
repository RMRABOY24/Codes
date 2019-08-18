// BSIT012
// Mark Ricardo raboy

import java.util.*;

   public class DavidAgoilo {

   	 public static void main(String[] args) {
   	 	Scanner scan = new Scanner(System.in);

   	 System.out.print("The Fisrt number is");
   	 int n1 = scan.nextInt();

   	 System.out.print("The Second number is");
   	 int n2 = scan.nextInt();

   	 	int sum = n1+n2;
   	    int diff = n1-n2;
   	    int quotient = n1/n2;
   	    int product = n1*n2;

   	    System.out.println(" the sum of " + n1 + " and " + n2 + " is " + sum);
   	    System.out.println(" the diff of " + n1 + " and " + n2 + " is " + diff);
   	    System.out.println(" the quotient of " + n1 + " and " + n2 + " is " + quotient);
   	    System.out.println(" the product of " + n1 + " and " + n2 + " is " + product);

   	 }

   }