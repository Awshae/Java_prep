import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

public class hashset{
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add(10);
        h.add(3.14);
        h.add('a');

        System.out.println(h.size());
        System.out.println(h);
        System.out.println("--------------");

        HashSet<Integer> h1 = new HashSet();
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList();
        System.out.println("Enter size");
        int size = s.nextInt();
        System.out.println("Enter the values");
        for(int i =0; i<size ; i++){
            h1.add(s.nextInt());
        }
        System.out.println("After removing Duplicates");
        for (Object i : h1) {
            System.out.println(i);
            
        }

    }
}