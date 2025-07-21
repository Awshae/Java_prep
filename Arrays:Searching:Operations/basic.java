import java.util.Scanner;
public class basic
{
    public static int Sum(int a[])
    {
        int sum = 0;
        for(int i=0; i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size");
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("Enter vals");
        for (int i = 0; i< size ; i++) {
            a[i] = s.nextInt();
            
        }
        System.out.println(Sum(a));
    }
}
