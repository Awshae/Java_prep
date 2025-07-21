import java.util.Scanner;
//Linear search with function
public class LSFunction
{
    public static int LinearSearch(int a[], int key){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            count++;
            if(key==a[i]){
                System.out.println("Ls Steps taken: "+count);
                return key;
        }
        }
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
        int flag = 0;
        System.out.println("Enter the Key");
        int key = s.nextInt();
        LinearSearch(a, key);

        if(flag == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key is found" );
        }
    }
}
// Time complexity- DSA brush up.
