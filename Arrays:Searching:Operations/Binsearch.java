import java.util.*;
public class Binsearch{
    public static int BinSearch(int a[], int key){
        Arrays.sort(a);
        int s = 0; //src
        int d = a.length-1; //destination
        int count = 0;
        while(s<d){
            count++;
            int m = (s+d)/2; //mid
            if(a[m]==key)
                return key;
            else
                if(a[m]>key)
                    d = m-1;
                else
                    s=m+1;
        }
        System.out.println("BS steps taken: "+count);
    return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("Enter vals");
        for (int i = 0; i<size ; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter the Key");
        int key = s.nextInt();
        BinSearch(a, key);
    }
}