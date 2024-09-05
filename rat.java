/* The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

Note:

Return -1 if the array is null
Return 0 if the total amount of food from all houses is not sufficient for all the rats.
Computed values lie within the integer range.
Example:

Input:

r: 7
unit: 2
n: 8
arr: 2 8 3 5 7 4 1 2
Output:

4*/

import java.util.Scanner;
public class Rats {
	public static int food(int n,int r,int arr[],int unit) {
		if(arr==null)
			return -1;
		int f=r*unit;
		int sum=0;
		int c=0;
	    for(int i=0;i<n;i++)
	    {
	      sum=sum+arr[i];
	      c++;
	      if(sum>=f) 
	      { 
	    	break;
	      }}
	    if (sum<f) {
	    	return 0;}
	    return c;
	    }
	      
	      public static void main(String[] args)
	      {
	    Scanner s = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("enter the number of rats:");
	    int r=s.nextInt();
	    System.out.println("enter the number of food each rat consumes:");
	    int unit=s.nextInt();
	    System.out.println("enter the size of array:");
	    int n=s.nextInt();    
	    int arr []=new int[n];	    
	    System.out.println("amount of food in each house:");
	    for(int i=0;i<n;i++)
	    {
	    
	    arr[i]=s.nextInt();    
	    }
	    System.out.println(food(n,r,arr,unit));
	}
	}
