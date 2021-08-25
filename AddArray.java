/* Java Program Example - One Dimensional Array Program */

import java.util.Scanner;
public class AddArray
{
   public static void main(String args[])
   {
        int a[] = new int[50];
        int n,i,sum =0;
        Scanner val = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = val.nextInt();
		System.out.print("Enter the elements:\n");
        for(i=0;i<n;i++)
        {
            a[i] = val.nextInt();
        }
	    for(i=0;i<n;i++)
        {
            sum = sum +a[i];
        }
        System.out.print("Sum of elements of one dimensional array: "+sum);
        
   }
}