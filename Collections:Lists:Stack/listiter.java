import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;
public class listiter{
//using list iteratior
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList();
        System.out.println("Enter size");
        int size = s.nextInt();

        System.out.println("Enter the values");
        for(int i =0; i<size ; i++){
            a.add(s.nextInt());
        }

        System.out.println("Using List Iterator");
        System.out.println("------SO-------");
        ListIterator i = a.listIterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }  
        System.out.println("------RO-------");
        ListIterator j = a.listIterator(a.size());
        while(j.hasPrevious()){
            System.out.println(j.previous());
        }
    }
    
}