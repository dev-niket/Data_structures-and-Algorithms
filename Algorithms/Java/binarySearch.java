
/**
 * Java program to implement binary search.
 *
 * @author Niket (dev-niket)
 */
import java.util.*;
class binarySearch { 
    // Returns index of x if it is present in arr[], 
    // else return -1 
    int Search(int a[], int x) 
    { 
        int l = 0, r = a.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; //Finding the middle element 
  
            // Case where middle element = x
            if (a[m] == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (a[m] < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 

        return (-1); 
    } 
  
    public static void main(String args[]) 
    { 
        Scanner obs = new Scanner(System.in);
        binarySearch ob = new binarySearch(); 
        System.out.println("Enter the number of elements :");
        int n = obs.nextInt(); 
        int a[]=new int[n];
        System.out.println("Enter the numbers in the array :");
        for(int i=0; i<n;i++)
            a[i]=obs.nextInt(); 
            
        System.out.println("Enter the number to be searched : ");
        int x=obs.nextInt();
        int result = ob.Search(a, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at "
                               + "index " + result); 
    } 
} 