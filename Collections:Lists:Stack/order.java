import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class order{
//program to sort ascending descending
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList();

        System.out.println("Enter the size");
        int size = s.nextInt();

        System.out.println("Enter the values");
        for(int i =0; i<size ; i++){
            a.add(s.nextInt());
        }

        System.out.println("------");
        Collections.sort(a);
        for (Object i : a) {
            System.out.println(i);
        }
        
        System.out.println("------");
        Collections.reverse(a);
        for (Object i : a) {
            System.out.println(i);
        }
    }

}

