
import java.util.HashSet;
import java.util.Scanner;

public class set_list_VV{

    public static int[] Duplicates(int a[]){
        //code
        HashSet<Integer> h = new HashSet();
        for(int i = 0; i< a.length ; i++){
            h.add(a[i]);
        }
        Object ob[] = h.toArray();
        int a1[] = new int[ob.length];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int)ob[i];
        }
        return a1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = s.nextInt();

        int a[] = new int[size];
        System.out.println("Enter values");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Duplicates removed");
        int res[] = Duplicates(a);
        for (int i = 0; i < res.length; i++) {
            System.err.println(res[i]);
        }
    }
}