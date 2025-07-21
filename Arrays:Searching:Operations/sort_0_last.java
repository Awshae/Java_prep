//1 0 2 0 3 0 4 0
// 1 2 3 4 0 0 0
// program to store 0 at the end of the array.
import java.util.Scanner;

public class sort_0_last
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("Enter vals");
        for (int i = 0; i<size ; i++) 
        {
            a[i] = s.nextInt();
        }
        System.out.println("===================");
        /* WITH OBJECT
        int arr[] = new int[a.length];
        int j = 0;
        for (int i = 0; i<arr.length ; i++)
        {
            if(a[i]!=0)
            {
                arr[j++]=a[i];
            }
        }
        while(j<a.length)
        {
            arr[j++]=0;
        }

        for (int i = 0; i <arr.length; i++)
        {
            a[i] = arr[i];
            System.out.print(a[i]+" ");    
        }
        */

       // WITHOUT OBJECT
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j<a.length; j++)
            if(a[i]==0 && a[j]!=0)
            {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        for (int i = 0; i <a.length; i++)
        {
            System.out.print(a[i]+" ");    
        }
    }
}

