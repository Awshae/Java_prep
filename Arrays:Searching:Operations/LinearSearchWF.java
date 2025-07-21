import java.util.Scanner;
public class LinearSearchWF
{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("Enter vals");
        for (int i = 0; i<size ; i++) {
            a[i] = s.nextInt();
        }
        int flag = 0;
        System.out.println("Enter the Key");
        int key = s.nextInt();
        for(int i = 0; i< size ; i++) {
            if(a[i]== key){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Key found");
        }
        else{
            System.out.println("No key");
        }
    }
}
// Time complexity- DSA brush up.
