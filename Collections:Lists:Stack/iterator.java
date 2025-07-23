
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class iterator{
//using iterator to iterate
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList();
        System.out.println("Enter size");
        int size = s.nextInt();

        System.out.println("Enter the values");
        for(int i =0; i<size ; i++){
            a.add(s.nextInt());
        }

        System.out.println("Using Iterator");
        Iterator i = a.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}