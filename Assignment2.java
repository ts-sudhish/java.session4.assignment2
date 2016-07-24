package sdh.java.session4;

import java.util.Scanner;

/**
 * @author Sudhish
 *
 */
public class Assignment2 {

	public static void main(String[] args) {
		 int n, c, d, swap, newN, newIndex=0;
		 boolean used=false;
		    Scanner in = new Scanner(System.in);
		 
		    System.out.println("Input number of integers to sort");
		    n = in.nextInt();
		 
		    int array[] = new int[n];
		    int newArray[] = new int[n+1];
		    System.out.println("Enter " + n + " integers");
		 
		    for (c = 0; c < n; c++) 
		      array[c] = in.nextInt();
		 
		    for (c = 0; c < ( n - 1 ); c++) {
		      for (d = 0; d < n - c - 1; d++) {
		        if (array[d] > array[d+1])
		        {
		          swap       = array[d];
		          array[d]   = array[d+1];
		          array[d+1] = swap;
		        }
		      }
		    }
		 
		    System.out.println("Sorted list of numbers in ascending order");
		 
		    for (c = 0; c < n; c++) 
		      System.out.println(array[c]);
	

		    System.out.println("Enter a number to be added in sorted list");
		    newN = in.nextInt();
		    
		    for (c = 0; c < array.length; c++) {
				if(array[c]>newN && used==false)
				{
					newArray[newIndex++] = newN;
					used = true;
				}
				newArray[newIndex++] = array[c];
			}
		    
		    System.out.println("Sorted list of numbers after inserting in ascending order");
			 
		    for (c = 0; c < n+1; c++) 
		      System.out.println(newArray[c]);
		    
	}
}
