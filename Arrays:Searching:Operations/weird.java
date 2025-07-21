//weird program with array
import java.util.Arrays;
import java.util.Scanner;
//Linear search with function
public class weird
{
    public static int weird(int a[], int sum)
    {
        Arrays.sort(a);
        if(a.length <2)
            return -1;
        int s = a[0]+a[1];
        if(s<sum)
            return a[0]*a[1];
        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sum");
        int sum = s.nextInt();
        System.out.println("Enter the size");
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("Enter vals");
        for (int i = 0; i<size ; i++) {
            a[i] = s.nextInt();
        }
        System.out.println(weird(a,sum));
    }
}
// Time complexity- DSA brush up.
