import java.util.*;
class Bubblesort{
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
		int temp;
		System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
        		    a[i] = sc.nextInt();
        }
        System.out.println("Bubble sort");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

	}

}
